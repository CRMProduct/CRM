package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.dao.IStaffDao;
import com.ibm.crm.vo.Crmstaff;
@Transactional(readOnly = true)
public class StaffBiz implements IStaffBiz {
	
	IStaffDao staffDao;
	public void setStaffDao(IStaffDao staffDao) {
		this.staffDao = staffDao;
	}
	
	//添加
	@Transactional(readOnly = false)
	@Override
	public boolean regist(Crmstaff crmStaff) {
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

}
