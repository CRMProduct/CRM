package com.ibm.crm.biz;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmclass;

public interface IClassBiz {
	public boolean registClass(Crmclass crmclass);

	public PageBean queryByPage(int pageCode, int pageSize);

	public Crmclass queryClass(int classId);

	public boolean modifyClass(Crmclass crmclass);
}
