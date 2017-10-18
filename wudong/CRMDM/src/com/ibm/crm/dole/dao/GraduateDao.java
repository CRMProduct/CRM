package com.ibm.crm.dole.dao;

import java.util.List;
import java.util.Map;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmgraduate;

public class GraduateDao extends GenericHibernateDao<Crmgraduate, Integer> implements IGraduateDao {


	@Override
	public Crmgraduate addGraduate(Crmgraduate crmGraduate) {
		// TODO Auto-generated method stub
		return super.update(crmGraduate);
	}

	@Override
	public PageBean query(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		PageBean pb = null;
		String hql = "from Crmgraduate";
		Object params[] = new Object[]{};
		pb = super.findByPage(hql, pageCode, pageSize, params);
		return pb;
	}

}
