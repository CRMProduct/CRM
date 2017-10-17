package com.ibm.crm.biz;

import java.util.List;

import com.ibm.crm.vo.Crmstudent;

public interface IStudentBiz {
	//查询所有
	public List<Crmstudent> findAllStudent();

	//查询单个
	public Crmstudent findByStudentId(int studentId);
}
