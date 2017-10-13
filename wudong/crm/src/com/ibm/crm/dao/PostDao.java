package com.ibm.crm.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.vo.Crmpost;

public class PostDao extends GenericHibernateDao<Crmpost, Integer> implements IPostDao {

	@Override
	public boolean addPost(Crmpost crmpost) {
		boolean flag = false;
		Crmpost newCrmPost = super.create(crmpost);
		if(newCrmPost!=null){
			flag = true;
		}
		return flag;
	}

}
