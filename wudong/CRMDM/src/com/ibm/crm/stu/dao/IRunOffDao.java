package com.ibm.crm.stu.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrunoff;

public interface IRunOffDao extends GenericDao<Crmrunoff, Integer> {
	
	public boolean add(Crmrunoff crmRunOff);
	
	public PageBean findByPage(int pageCode, int pageSize);

}
