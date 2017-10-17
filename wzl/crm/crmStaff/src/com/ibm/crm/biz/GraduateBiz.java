package com.ibm.crm.biz;

import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IGraduateDao;
import com.ibm.crm.vo.Crmgraduate;

public class GraduateBiz implements IGraduateBiz {

	IGraduateDao graduateDao;
	public void setGraduateDao(IGraduateDao graduateDao) {
		this.graduateDao = graduateDao;
	}

	@Override
	public boolean regist(Crmgraduate crmGraduate) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(graduateDao.addGraduate(crmGraduate) != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return graduateDao.query(pageCode, pageSize, map);
	}

}
