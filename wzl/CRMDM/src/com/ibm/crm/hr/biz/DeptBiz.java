package com.ibm.crm.hr.biz;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.hr.dao.IDeptDao;
import com.ibm.crm.pojo.Crmdepartment;

@Transactional(readOnly=true)
public class DeptBiz implements IDeptBiz {

	IDeptDao deptDao;
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

	//分页
	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return deptDao.findByPage(pageCode, pageSize, map);
	}

	//添加部门
	@Transactional(readOnly=false)	
	@Override
	public boolean registDepartment(Crmdepartment department) {
		// TODO Auto-generated method stub
		return deptDao.addDepartment(department);
	}

	//根据ID查询部门
	@Override
	public Crmdepartment findById(int depId) {
		// TODO Auto-generated method stub
		return deptDao.findById(depId);
	}

	//更新部门信息
	@Transactional(readOnly=false)
	@Override
	public Crmdepartment modifyDept(Crmdepartment crmdepartment) {
		// TODO Auto-generated method stub
		return deptDao.update(crmdepartment);
	}
	
	//查询所有部门信息
	@Override
	public List<Crmdepartment> findAllDept() {
		// TODO Auto-generated method stub
		return deptDao.findAllDept();
	}
}