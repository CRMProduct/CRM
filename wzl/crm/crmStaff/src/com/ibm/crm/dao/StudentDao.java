package com.ibm.crm.dao;

import java.util.List;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmstudent;

public class StudentDao extends GenericHibernateDao<Crmstudent, Integer> implements IStudentDao {

	@Override
	public Crmstudent findByStudentId(int studentId) {
		// TODO Auto-generated method stub
		Crmstudent crmStudent = super.findById(studentId);
		return crmStudent;
	}

}
