package com.ibm.crm.cond.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.cond.dao.IReferDao;
import com.ibm.crm.pojo.Crmrefer;
@Transactional(readOnly=true)
public class ReferBiz implements IReferBiz {
	IReferDao referDao;

	public void setReferDao(IReferDao referDao) {
		this.referDao = referDao;
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return referDao.findByPage(pageCode, pageSize, map);
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
