package com.ibm.crm.stu.dao;

import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstudent;

public interface IStudentDao extends GenericDao<Crmstudent, Integer> {
	
	public PageBean findByPage(int pageCode, int pageSize, Map map);
	
	public Crmstudent addStudent(Crmstudent student);
	
	public Crmstudent findStudent(int studentId);
	
	public boolean updateStudent(Crmstudent student);

}
