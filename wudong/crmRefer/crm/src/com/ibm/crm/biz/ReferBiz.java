package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IReferDao;
import com.ibm.crm.vo.Crmrefer;
@Transactional(readOnly=true)
public class ReferBiz implements IReferBiz {
	IReferDao referDao;

	public void setReferDao(IReferDao referDao) {
		this.referDao = referDao;
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return referDao.findByPage(pageCode, pageSize);
	}

	@Override
	public Crmrefer findById(int referId) {
		// TODO Auto-generated method stub
		return referDao.queryById(referId);
	}
	@Transactional(readOnly=false)
	@Override
	public  boolean  modifyRefer(Crmrefer crmrefer) {
		// TODO Auto-generated method stub
		return referDao.updateRefer(crmrefer);
	}
      
}
