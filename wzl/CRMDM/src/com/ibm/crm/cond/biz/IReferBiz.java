package com.ibm.crm.cond.biz;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrefer;

public interface IReferBiz {

	public PageBean queryByPage(int pageCode, int pageSize);
	
	public Crmrefer findById(int referId);
	
	public  boolean modifyRefer(Crmrefer crmrefer);
}
