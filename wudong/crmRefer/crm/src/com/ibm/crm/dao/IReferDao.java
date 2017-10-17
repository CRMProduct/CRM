package com.ibm.crm.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmrefer;

public interface IReferDao extends GenericDao<Crmrefer,Integer> {

	public PageBean findByPage(int pageCode, int pageSize);
	
	public Crmrefer queryById(int referId);
	
	public boolean updateRefer(Crmrefer crmrefer);
}
