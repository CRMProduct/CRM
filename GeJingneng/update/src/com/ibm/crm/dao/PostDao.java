package com.ibm.crm.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;

public class PostDao extends GenericHibernateDao<Crmpost ,Integer>implements IPostDao {

	@Override
	public boolean modifyPost(Crmpost crmpost) {
		boolean flag = false;
		Crmpost modifyPost = super.update(crmpost);
		if(modifyPost!=null){
			flag=true;
		}
		return flag;
	}

	@Override
	public Crmpost findById(int postId) {
		Crmpost crmpost=super.findById(postId);
		return crmpost;
	}

	

	
	
	
}
