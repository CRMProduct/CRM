package com.ibm.crm.stu.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrunoff;
import com.ibm.crm.stu.dao.IRunOffDao;
@Transactional(readOnly=true)
public class RunOffBiz implements IRunOffBiz {

	IRunOffDao runOffDao;
	public void setRunOffDao(IRunOffDao runOffDao) {
		this.runOffDao = runOffDao;
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return runOffDao.findByPage(pageCode, pageSize);
	}

	@Transactional(readOnly=false)
	@Override
	public boolean regist(Crmrunoff crmRunOff) {
		// TODO Auto-generated method stub
		return runOffDao.add(crmRunOff);
	}

}
