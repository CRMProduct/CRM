package com.ibm.crm.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment, Integer> {
	
	//分页
	public PageBean findByPage(int pageCode, int pageSize, Map map);
	
	//根据Id查询
	public Crmdepartment findById(int depId);
	
	//更新
	public Crmdepartment updateDept(Crmdepartment crmdepartment);

}
