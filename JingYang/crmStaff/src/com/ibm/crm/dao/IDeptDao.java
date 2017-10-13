package com.ibm.crm.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment,Integer>{

	public boolean addDepartment(Crmdepartment department);
	
}
