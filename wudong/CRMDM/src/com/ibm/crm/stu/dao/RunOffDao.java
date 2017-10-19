package com.ibm.crm.stu.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrunoff;

public class RunOffDao extends GenericHibernateDao<Crmrunoff, Integer> implements IRunOffDao {

	@Override
	public boolean add(Crmrunoff crmRunOff) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmrunoff addRunOff = super.create(crmRunOff);
		if(addRunOff != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public PageBean findByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		PageBean pb = super.findByPage("from Crmrunoff", pageCode, pageSize, new Object[]{});
		return pb;
	}

}
