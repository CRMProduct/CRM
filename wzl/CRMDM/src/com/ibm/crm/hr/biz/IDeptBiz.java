package com.ibm.crm.hr.biz;

import java.util.List;
import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmdepartment;

public interface IDeptBiz {

	//分页
	public PageBean queryByPage(int pageCode, int pageSize, Map map);
	//添加部门
	public boolean registDepartment(Crmdepartment department);
	//根据ID查询部门
	public Crmdepartment findById(int depId);
	//更新部门信息
	public Crmdepartment modifyDept(Crmdepartment crmdepartment);
	// 查询所有部门信息
	public List<Crmdepartment> findAllDept();
}
