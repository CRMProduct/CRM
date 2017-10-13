package com.ibm.crm.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment, Integer> {
	
	//分页
	public PageBean findByPage(int pageCode, int pageSize, Map map);
	//添加部门
	public boolean addDepartment(Crmdepartment department);
	//根据ID查询部门
	public Crmdepartment findById(int depId);
	//更新部门信息
	public Crmdepartment updateDept(Crmdepartment crmdepartment);

}
