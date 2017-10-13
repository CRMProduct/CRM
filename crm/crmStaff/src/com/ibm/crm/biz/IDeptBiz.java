package com.ibm.crm.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmdepartment;

public interface IDeptBiz {

	//分页
	public PageBean queryByPage(int pageCode, int pageSize, Map map);
	//添加部门
	public boolean registDepartment(Crmdepartment department);
	//根据ID查询部门
	public Crmdepartment findById(int depId);
	//更新部门信息
	public Crmdepartment modifyDept(Crmdepartment crmdepartment);
	
}
