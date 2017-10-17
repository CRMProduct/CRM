package com.ibm.crm.dao;

import java.util.List;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmclass;
import com.ibm.crm.vo.Crmstudent;

public interface IStudentDao extends GenericDao<Crmstudent, Integer> {

	
	//查询单个
	public Crmstudent findByStudentId(int studentId);

}
