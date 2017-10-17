package com.ibm.crm.dao;

import java.util.List;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmcoursetype;

public class CourseDao extends GenericHibernateDao<Crmcoursetype, Integer> implements ICouesrDao {

	@Override
	public boolean addCourse(Crmcoursetype crmcoursetype) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmcoursetype newCrmcoursetype = super.create(crmcoursetype);
		if (newCrmcoursetype != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public PageBean findByPage(int pageCode, int pageSize) {
		PageBean pb = super.findByPage("from Crmcoursetype", pageCode, pageSize, new Object[] {});
		return pb;
	}

	@Override
	public Crmcoursetype findById(int courseTypeId) {
		// TODO Auto-generated method stub
		Crmcoursetype crmcoursetype = super.findById(courseTypeId);
		return crmcoursetype;
	}

	@Override
	public boolean updateCourse(Crmcoursetype crmcoursetype) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmcoursetype updateCourse = super.update(crmcoursetype);
		if (updateCourse != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<Crmcoursetype> findAllCourse() {
		return super.findAll();
	}

}
