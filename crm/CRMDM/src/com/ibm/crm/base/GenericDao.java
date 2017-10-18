package com.ibm.crm.base;

import java.io.Serializable;
import java.util.List;




public interface GenericDao<T extends Serializable,ID extends Serializable> {
	
	public T create(T entity);
	
	public void delete(ID id);
	
	public T update(T entity);
	
	public List<T> findAll();
	
	public T findById(ID id);
	
	public List findByHQL(String hql,Object[] params);

	public PageBean findByPage(String hql,int pagecode,int pagesize,Object[] params);
	
	public void bulkUpdate(String hql,Object[] params);
}
