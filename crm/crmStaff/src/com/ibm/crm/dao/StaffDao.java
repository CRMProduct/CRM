package com.ibm.crm.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.vo.Crmstaff;

public class StaffDao extends GenericHibernateDao<Crmstaff, Integer> implements IStaffDao {

	
	@Override
	public boolean add(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(super.create(crmStaff) != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateStaff(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(super.update(crmStaff) != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public Crmstaff findStaffById(int staffId) {
		// TODO Auto-generated method stub
		return super.findById(staffId);
	}

}
