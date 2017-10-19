package com.ibm.crm.stu.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstation;
import com.ibm.crm.stu.dao.IStationDao;
@Transactional(readOnly=true)
public class StationBiz implements IStationBiz {

	IStationDao stationDao;
	public void setStationDao(IStationDao stationDao) {
		this.stationDao = stationDao;
	}

	@Transactional(readOnly=false)
	@Override
	public Crmstation regist(Crmstation crmStation) {
		// TODO Auto-generated method stub
		return stationDao.add(crmStation);
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return stationDao.findByPage(pageCode, pageSize);
	}

}
