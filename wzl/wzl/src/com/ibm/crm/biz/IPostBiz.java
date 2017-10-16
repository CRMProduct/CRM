package com.ibm.crm.biz;

import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.dao.IPostDao;
import com.ibm.vo.Crmpost;

public interface IPostBiz {
	
	//查询所有职务
	public PageBean queryByPage(int pageCode,int pageSize,Map map);
	
	//根据Id查询
	public Crmpost checkById(int postId);
	
	//更新
	public boolean updatePost(Crmpost crmpost);
	
	//添加
	public boolean registPost(Crmpost crmpost);
}
