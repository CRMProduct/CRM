package com.ibm.crm.dao;

import java.util.List;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.vo.Crmdepartment;

public class DeptDao extends GenericHibernateDao<Crmdepartment, Integer> implements IDeptDao {

	@Override
	public Crmdepartment findByDeptId(int depId) {
		// TODO Auto-generated method stub
		return super.findById(depId);
	}

	@Override
	public Crmdepartment updateDept(Crmdepartment crmDepartment) {
		// TODO Auto-generated method stub
		return super.update(crmDepartment);
	}

	
}
