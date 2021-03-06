package com.ibm.crm.hr.dao;

import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmpost;

public interface IPostDao {

	//职务分页
	public PageBean findByPage(int pageCode,int pageSize,Map map);

	//根据id查询
	public Crmpost findById(int postId);

	//更新
	public boolean modifyPost(Crmpost crmpost);

	//添加
	public boolean addPost(Crmpost crmpost);
}
