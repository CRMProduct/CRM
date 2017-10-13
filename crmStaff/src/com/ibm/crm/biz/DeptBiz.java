package com.ibm.crm.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IDeptDao;

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

}
