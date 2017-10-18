package com.ibm.crm.stu.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstudent;
import com.ibm.crm.stu.dao.IStudentDao;
@Transactional(readOnly=true)
public class StudentBiz implements IStudentBiz {

	IStudentDao studentDao;
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return studentDao.findByPage(pageCode, pageSize, map);
	}
	
	@Transactional(readOnly=false)
	@Override
	public Crmstudent regist(Crmstudent student) {
		// TODO Auto-generated method stub
		return studentDao.addStudent(student);
	}

	@Override
	public Crmstudent queryById(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.findStudent(studentId);
	}

	@Transactional(readOnly=false)
	@Override
	public boolean modify(Crmstudent student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

}
