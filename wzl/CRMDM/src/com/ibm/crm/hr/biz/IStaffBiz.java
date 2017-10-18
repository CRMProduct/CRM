package com.ibm.crm.hr.biz;

import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstaff;

public interface IStaffBiz {

	//分页
	public PageBean queryByPage(int pageCode, int pageSize, Map map);
	//添加员工
	public Crmstaff regist(Crmstaff crmStaff);

	//编辑员工
	public boolean modifyStaff(Crmstaff crmStaff);

	//根据id查找员工
	public Crmstaff searchById(int staffId);
}
