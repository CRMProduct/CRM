package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.dao.IDeptDao;
import com.ibm.crm.vo.Crmdepartment;


@Transactional(readOnly=true)	
public class DeptBiz implements IDeptBiz {

	IDeptDao deptDao;
	
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	
@Transactional(readOnly=false)	
	@Override
	public boolean registDepartment(Crmdepartment department) {
		// TODO Auto-generated method stub
		return deptDao.addDepartment(department);
	}

}
	
	
	
