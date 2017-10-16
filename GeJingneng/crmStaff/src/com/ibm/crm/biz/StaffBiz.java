package com.ibm.crm.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IStaffDao;

@Transactional(readOnly=true)
public class StaffBiz implements IStaffBiz {

	IStaffDao staffDao;
	public void setStaffDao(IStaffDao staffDao) {
		this.staffDao = staffDao;
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return staffDao.findByPage(pageCode, pageSize, map);
	}

}
