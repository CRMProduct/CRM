package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IClassDao;
import com.ibm.crm.vo.Crmclass;

@Transactional(readOnly = true)
public class ClassBiz implements IClassBiz {

	IClassDao classDao;
	public void setClassDao(IClassDao classDao) {
		this.classDao = classDao;
	}
	@Transactional(readOnly = false)
	@Override
	public boolean registClass(Crmclass crmclass) {
		// TODO Auto-generated method stub
		return classDao.addClass(crmclass);
	}
	@Override
	public Crmclass queryClass(int classId) {
		// TODO Auto-generated method stub
		return classDao.findClass(classId);
	}
	@Transactional(readOnly = false)
	@Override
	public boolean modifyClass(Crmclass crmclass) {
		// TODO Auto-generated method stub
		return classDao.updateClass(crmclass);
	}
	@Override
	public PageBean queryByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return classDao.findByPage(pageCode, pageSize);
	}
	

}
