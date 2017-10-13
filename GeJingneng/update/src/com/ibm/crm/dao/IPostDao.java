package com.ibm.crm.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;

public interface IPostDao extends GenericDao<Crmpost,Integer>{

	public Crmpost findById(int postId);
	
	public boolean modifyPost(Crmpost crmpost);
	
}
