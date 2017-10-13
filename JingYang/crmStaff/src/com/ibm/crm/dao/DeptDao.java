package com.ibm.crm.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.vo.Crmdepartment;

public class DeptDao extends GenericHibernateDao<Crmdepartment,Integer>implements IDeptDao {

	@Override
	public boolean addDepartment(Crmdepartment department) {
		boolean flag = false;
		
	
	Crmdepartment d = super.create(department);
		if(d!=null){
			flag=true;
		}
		return flag;
	}

}
