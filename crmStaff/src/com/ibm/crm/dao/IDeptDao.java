package com.ibm.crm.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment, Integer> {
	//根据Id查找部门
	public Crmdepartment findByDeptId(int depId);
	
	//更新部门信息
	public Crmdepartment updateDept(Crmdepartment crmDepartment);
}
