package com.ibm.crm.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;



public abstract class GenericHibernateDao<T extends Serializable, ID extends Serializable>
		implements GenericDao<T, ID> {
	//持久化类
	private Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public GenericHibernateDao() {
		//使用反射技术得到T的真实类型,获取当前new的对象的泛型的父类 
		ParameterizedType pt =(ParameterizedType) this.getClass().getGenericSuperclass();  
        //获取第一个类型参数的真实类型  
        this.persistentClass = (Class<T>) pt.getActualTypeArguments()[0];  
		
	}
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//批量更新
	public void bulkUpdate(String hql, Object[] params) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery(hql);
		for (int i = 0; i < params.length; i++)
			q.setParameter(i, params[i]);
		q.executeUpdate();
	}
	//增
	public T create(T entity) {
		Session session = sessionFactory.getCurrentSession();
		session.save(entity);
		return entity;
	}
	// 删
	public void delete(ID id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(findById(id));
	}
	// 查询所有信息
	public List<T> findAll() {
		return findByCriteria(new ArrayList<Criterion>());
	}
	// HQL查询
	@SuppressWarnings("unchecked")
	public List<T> findByHQL(String hql, Object[] params) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery(hql);
		for (int i = 0; i < params.length; i++)
			q.setParameter(i, params[i]);
		return q.list();
	}
	// 查询单个对象
	@SuppressWarnings("unchecked")
	public T findById(ID id) {
		Session session = sessionFactory.getCurrentSession();
		T entity = (T) session.load(persistentClass, id);
		return entity;
	}
	// 分页查询
	public PageBean findByPage(String hql, int pageCode, int pageSize,
			Object[] params) {
		Session session = sessionFactory.getCurrentSession();
		PageBean pb = new PageBean();
		Query q = session.createQuery("select count(*) "
				+ hql.substring(hql.toLowerCase().indexOf("from")));
		for (int i = 0; i < params.length; i++)
			q.setParameter(i, params[i]);
		Long allCount = (Long) q.uniqueResult();
		pb.setAllCount(allCount.intValue());
		pb.setAllPages((allCount.intValue()-1)/pageSize + 1);
		if(pageCode > pb.getAllPages()) {
			pageCode = (int) pb.getAllPages();
		}
		pb.setPageCode(pageCode);
		pb.setPageSize(pageSize);
		// 
		q = session.createQuery(hql);
		for (int i = 0; i < params.length; i++)
			q.setParameter(i, params[i]);
		q.setMaxResults(pageSize);
		q.setFirstResult((pageCode - 1) * pageSize);
		List crmStaff = q.list();
		pb.setList(crmStaff);
		//
		return pb;
	}
	

	public T update(T entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
		return entity;
	}

	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(List<Criterion> criterion) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				getPersistentClass());
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}
}
