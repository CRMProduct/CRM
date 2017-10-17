package com.ibm.crm.biz;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmrefer;

public interface IReferBiz {

	public PageBean queryByPage(int pageCode, int pageSize);
	
	public Crmrefer findById(int referId);
	
	public  boolean modifyRefer(Crmrefer crmrefer);
}
