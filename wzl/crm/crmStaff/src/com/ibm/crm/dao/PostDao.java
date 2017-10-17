package com.ibm.crm.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmpost;

public class PostDao extends GenericHibernateDao<Crmpost, Integer> implements IPostDao {

	//职务分页
	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		String hql = "from Crmpost";
		Object params[] = new Object[]{};
		PageBean pb = super.findByPage(hql, pageCode, pageSize, params);
		return pb;
	}

	//更新
	@Override
	public boolean modifyPost(Crmpost crmpost) {
		boolean flag = false;
		Crmpost modifyPost = super.update(crmpost);
		if(modifyPost!=null){
			flag=true;
		}
		return flag;
	}

	//根据Id查询
	@Override
	public Crmpost findById(int postId) {
		Crmpost crmpost=super.findById(postId);
		return crmpost;
	}

	//添加
	@Override
	public boolean addPost(Crmpost crmpost) {
		boolean flag = false;
		Crmpost newCrmPost = super.create(crmpost);
		if(newCrmPost!=null){
			flag = true;
		}
		return flag;
	}

	@Override
	public List<Crmpost> findAllPost() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public List<Crmpost> findByDepId(Map map) {
		// TODO Auto-generated method stub
		List<Crmpost> postList = new ArrayList<Crmpost>();
		String hql = "select p from Product as p where 1=1";
		Object[] params = new Object[]{};
		if(map != null && map.size() > 0){
			List<Object> list = new ArrayList<Object>();
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				String key = iter.next();
				if("postId".equals(key)){
					hql += "and p.postId like ?";
					list.add(map.get(key));
				}
			}
			params = list.toArray();
		}
		postList = super.findByHQL(hql, params);
		return postList;
	}

}
