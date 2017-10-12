package com.ibm.crm.biz;

import com.ibm.vo.Crmdepartment;

public interface IDeptBiz {

	//根据Id查部门
	public Crmdepartment srhDeptById(int depId);
	
	//更新部门信息
	public Crmdepartment modifyDept(Crmdepartment crmDepartment);
}
