package com.ibm.crm.dole.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dole.dao.IGraduateDao;
import com.ibm.crm.pojo.Crmgraduate;
@Transactional(readOnly=true)
public class GraduateBiz implements IGraduateBiz {

	IGraduateDao graduateDao;
	public void setGraduateDao(IGraduateDao graduateDao) {
		this.graduateDao = graduateDao;
	}

	@Transactional(readOnly=false)
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
