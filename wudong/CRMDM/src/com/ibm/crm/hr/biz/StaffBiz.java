package com.ibm.crm.hr.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.hr.dao.IStaffDao;
import com.ibm.crm.pojo.Crmstaff;
@Transactional(readOnly = true)
public class StaffBiz implements IStaffBiz {
	
	IStaffDao staffDao;
	public void setStaffDao(IStaffDao staffDao) {
		this.staffDao = staffDao;
	}
	
	//添加
	@Transactional(readOnly = false)
	@Override
	public Crmstaff regist(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		return staffDao.add(crmStaff);
	}
	
	//更新
	@Transactional(readOnly = false)
	@Override
	public boolean modifyStaff(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		return staffDao.updateStaff(crmStaff);
	}
	
	//根据id查找
	@Override
	public Crmstaff searchById(int staffId) {
		// TODO Auto-generated method stub
		return staffDao.findStaffById(staffId);
	}
	
	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return staffDao.findByPage(pageCode, pageSize, map);
	}

	@Override
	public Crmstaff check(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		return staffDao.login(loginName, loginPwd);
	}

}
