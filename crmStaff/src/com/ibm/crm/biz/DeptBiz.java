package com.ibm.crm.biz;

<<<<<<< HEAD
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IDeptDao;

@Transactional(readOnly=true)
public class DeptBiz implements IDeptBiz {

=======
import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.dao.IDeptDao;
import com.ibm.vo.Crmdepartment;

@Transactional(readOnly=true)
public class DeptBiz implements IDeptBiz {
	
>>>>>>> 795f20e72cac21aa9ffa1b102163771bd621ac0b
	IDeptDao deptDao;
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
<<<<<<< HEAD

	//分页
	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return deptDao.findByPage(pageCode, pageSize, map);
=======
	
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
>>>>>>> 795f20e72cac21aa9ffa1b102163771bd621ac0b
	}

}
