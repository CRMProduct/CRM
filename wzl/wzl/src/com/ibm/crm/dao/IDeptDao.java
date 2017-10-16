package com.ibm.crm.dao;

import java.util.List;
import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment, Integer> {

	//分页
	public PageBean findByPage(int pageCode, int pageSize, Map map);

	//根据Id查询
	public Crmdepartment findById(int depId);

	// 查询所有部门信息
	public List<Crmdepartment> findAllDept();

	//更新
	public Crmdepartment updateDept(Crmdepartment crmdepartment);

}
