package com.ibm.crm.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmclass;

public class ClassDao extends GenericHibernateDao<Crmclass, Integer> implements IClassDao {

	@Override
	public boolean addClass(Crmclass crmclass) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmclass newCrmClass = super.create(crmclass);
		if (newCrmClass != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Crmclass findClass(int classId) {
		Crmclass crmclass = super.findById(classId);
		return crmclass;
	}

	@Override
	public boolean updateClass(Crmclass crmclass) {
		boolean flag = false;
		Crmclass updateCrmclass = super.update(crmclass);
		if (updateCrmclass != null) {
			flag = true;
		}
		return flag;
	}
	@Override
	public PageBean findByPage(int pageCode, int pageSize) {
		PageBean pb = super.findByPage("from Crmclass", pageCode, pageSize,new Object[]{});
		return pb;
	}
}
