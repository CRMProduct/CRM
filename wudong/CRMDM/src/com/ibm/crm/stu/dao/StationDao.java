package com.ibm.crm.stu.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstation;

public class StationDao extends GenericHibernateDao<Crmstation, Integer> implements IStationDao {

	@Override
	public Crmstation add(Crmstation crmStation) {
		// TODO Auto-generated method stub
		Crmstation station = super.create(crmStation);
		return station;
	}

	@Override
	public PageBean findByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		String hql = "from Crmstation";
		PageBean pb = super.findByPage(hql, pageCode, pageSize, new Object[]{});
		return pb;
	}

}
