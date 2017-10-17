package com.ibm.crm.biz;

import java.util.List;

import com.ibm.crm.dao.IStudentDao;
import com.ibm.crm.vo.Crmstudent;

public class StudentBiz implements IStudentBiz {

	IStudentDao studentDao;
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Crmstudent> findAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Crmstudent findByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.findById(studentId);
	}

}
