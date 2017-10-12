package com.ibm.crm.biz;

<<<<<<< HEAD
import java.util.Map;

import com.ibm.crm.base.PageBean;

public interface IDeptBiz {
	
	//分页
	public PageBean queryByPage(int pageCode, int pageSize, Map map);

=======
import com.ibm.vo.Crmdepartment;

public interface IDeptBiz {

	//根据Id查部门
	public Crmdepartment srhDeptById(int depId);
	
	//更新部门信息
	public Crmdepartment modifyDept(Crmdepartment crmDepartment);
>>>>>>> 795f20e72cac21aa9ffa1b102163771bd621ac0b
}
