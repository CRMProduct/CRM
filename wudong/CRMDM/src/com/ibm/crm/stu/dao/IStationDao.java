package com.ibm.crm.stu.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstation;

public interface IStationDao extends GenericDao<Crmstation, Integer> {
	
	public Crmstation add(Crmstation crmStation);
	
	public PageBean findByPage(int pageCode, int pageSize);

}
