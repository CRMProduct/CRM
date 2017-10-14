package com.ibm.crm.biz;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IDeptDao;
import com.ibm.vo.Crmdepartment;

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

	@Override
	public Crmdepartment findById(int depId) {
		// TODO Auto-generated method stub
		return deptDao.findById(depId);
	}

	@Transactional(readOnly=false)
	@Override
	public Crmdepartment modifyDept(Crmdepartment crmdepartment) {
		// TODO Auto-generated method stub
		return deptDao.update(crmdepartment);
	}

	@Override
	public List<Crmdepartment> findAllDept() {
		// TODO Auto-generated method stub
		return deptDao.findAllDept();
	}

}
