package com.ibm.crm.cond.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrefer;

public interface IReferDao extends GenericDao<Crmrefer,Integer> {

	public PageBean findByPage(int pageCode, int pageSize,Map map);
	
	public Crmrefer queryById(int referId);
	
	public boolean updateRefer(Crmrefer crmrefer);
}
