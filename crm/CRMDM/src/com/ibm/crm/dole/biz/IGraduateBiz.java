package com.ibm.crm.dole.biz;

import java.util.Map;


import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmgraduate;

public interface IGraduateBiz {

	//添加
	public boolean regist(Crmgraduate crmGraduate);

	//分页
	public PageBean queryByPage(int pageCode,int pageSize,Map map);
}
