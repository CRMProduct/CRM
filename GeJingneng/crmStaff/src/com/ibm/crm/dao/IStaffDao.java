package com.ibm.crm.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmstaff;

public interface IStaffDao extends GenericDao<Crmstaff, Integer> {
	
	//分页
	public PageBean findByPage(int pageCode, int pageSize, Map map);

}
