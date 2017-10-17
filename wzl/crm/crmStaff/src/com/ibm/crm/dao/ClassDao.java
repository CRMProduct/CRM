package com.ibm.crm.dao;

import java.util.List;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmclass;

public class ClassDao extends GenericHibernateDao<Crmclass, Integer> implements IClassDao {


	@Override
	public Crmclass findByClassId(int classId) {
		// TODO Auto-generated method stub
		Crmclass crmClass = super.findById(classId);
		return crmClass;
	}

}
