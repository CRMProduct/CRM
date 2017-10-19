package com.ibm.crm.stu.biz;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrunoff;

public interface IRunOffBiz {

	public PageBean queryByPage(int pageCode, int pageSize);
	
	public boolean regist(Crmrunoff crmRunOff);
}
