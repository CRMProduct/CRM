package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.dao.IDeptDao;
import com.ibm.vo.Crmdepartment;

@Transactional(readOnly=true)
public class DeptBiz implements IDeptBiz {
	
	IDeptDao deptDao;
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	//查询dept
	@Override
	public Crmdepartment srhDeptById(int depId) {
		// TODO Auto-generated method stub
		return deptDao.findByDeptId(depId);
	}
	
	//更新dept
	@Transactional(readOnly=false)
	@Override
	public Crmdepartment modifyDept(Crmdepartment crmDepartment) {
		// TODO Auto-generated method stub
		return deptDao.updateDept(crmDepartment);
	}

}
