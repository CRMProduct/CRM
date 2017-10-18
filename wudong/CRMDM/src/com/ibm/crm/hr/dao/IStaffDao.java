package com.ibm.crm.hr.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstaff;

public interface IStaffDao extends GenericDao<Crmstaff, Integer> {
	
	//添加员工
	public Crmstaff add(Crmstaff crmStaff);
	
	//编辑员工
	public boolean updateStaff(Crmstaff crmStaff);
	
	//根据id查找员工
	public Crmstaff findStaffById(int staffId);
	//分页
	public PageBean findByPage(int pageCode, int pageSize, Map map);
	
	public Crmstaff login(String loginName,String loginPwd);
	
}
