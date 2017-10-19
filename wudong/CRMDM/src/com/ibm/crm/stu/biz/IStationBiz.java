package com.ibm.crm.stu.biz;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstation;

public interface IStationBiz {
	
	public Crmstation regist(Crmstation crmStation);
	
	public PageBean queryByPage(int pageCode,int pageSize);

}
