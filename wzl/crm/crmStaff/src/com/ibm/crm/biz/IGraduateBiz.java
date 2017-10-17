package com.ibm.crm.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmgraduate;
@Transactional(readOnly=true)
public interface IGraduateBiz {

	//添加
	public boolean regist(Crmgraduate crmGraduate);

	//分页
	public PageBean queryByPage(int pageCode,int pageSize,Map map);
}
