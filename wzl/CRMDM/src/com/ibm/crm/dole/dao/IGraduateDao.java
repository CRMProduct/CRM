package com.ibm.crm.dole.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmgraduate;

public interface IGraduateDao extends GenericDao<Crmgraduate, Integer> {
	//添加
	public Crmgraduate addGraduate(Crmgraduate crmGraduate);
	
	//分页
	
	public PageBean query(int pageCode,int pageSize,Map map);
}
