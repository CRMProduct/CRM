package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.vo.Crmstaff;

public interface IStaffBiz {

	//添加员工
	public boolean regist(Crmstaff crmStaff);

	//编辑员工
	public boolean modifyStaff(Crmstaff crmStaff);

	//根据id查找员工
	public Crmstaff searchById(int staffId);
}
