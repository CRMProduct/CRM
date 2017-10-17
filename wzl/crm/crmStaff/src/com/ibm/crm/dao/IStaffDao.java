package com.ibm.crm.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.vo.Crmstaff;

public interface IStaffDao extends GenericDao<Crmstaff, Integer> {
	
	//添加员工
	public boolean add(Crmstaff crmStaff);
	
	//编辑员工
	public boolean updateStaff(Crmstaff crmStaff);
	
	//根据id查找员工
	public Crmstaff findStaffById(int staffId);
}
