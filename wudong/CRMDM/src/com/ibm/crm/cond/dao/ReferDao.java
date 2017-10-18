package com.ibm.crm.cond.dao;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrefer;

public class ReferDao extends GenericHibernateDao<Crmrefer,Integer> implements IReferDao {
//分页
	@Override
	public PageBean findByPage(int pageCode, int pageSize) {
		PageBean pb = super.findByPage("from Crmrefer", pageCode, pageSize, new Object[]{});
		return pb;
	}
//根据ID查找
	@Override
	public Crmrefer queryById(int referId) {
		Crmrefer crmrefer = super.findById(referId);
		return  crmrefer;
	}
//更新咨询表中的信息
	@Override
	public boolean updateRefer(Crmrefer crmrefer) {
		boolean flag = false;
		Crmrefer updateRefer = super.update(crmrefer);
		if(updateRefer!=null){
			flag = true;
		}
		return flag ;
	}

	
	
}
