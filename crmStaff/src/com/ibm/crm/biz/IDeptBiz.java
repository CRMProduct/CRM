package com.ibm.crm.biz;

import java.util.Map;

import com.ibm.crm.base.PageBean;

public interface IDeptBiz {
	
	//分页
	public PageBean queryByPage(int pageCode, int pageSize, Map map);

}
