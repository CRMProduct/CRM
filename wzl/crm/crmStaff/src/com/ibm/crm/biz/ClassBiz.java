package com.ibm.crm.biz;

import java.util.List;

import com.ibm.crm.dao.IClassDao;
import com.ibm.crm.vo.Crmclass;

public class ClassBiz implements IClassBiz {

	IClassDao classDao;
	public void setClassDao(IClassDao classDao) {
		this.classDao = classDao;
	}

	@Override
	public List<Crmclass> findAllClass() {
		// TODO Auto-generated method stub
		return classDao.findAll();
	}

	@Override
	public Crmclass findByClassId(int classId) {
		// TODO Auto-generated method stub
		return classDao.findByClassId(classId);
	}

}
