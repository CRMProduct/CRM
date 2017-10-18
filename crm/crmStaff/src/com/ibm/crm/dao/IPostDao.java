package com.ibm.crm.dao;

import java.util.List;
import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmpost;

public interface IPostDao {

	//职务分页
	public PageBean findByPage(int pageCode,int pageSize,Map map);

	//根据id查询
	public Crmpost findById(int postId);

	//更新
	public boolean modifyPost(Crmpost crmpost);

	//添加
	public boolean addPost(Crmpost crmpost);
	
	// 查询所有部门信息
	public List<Crmpost> findAllPost();
	
}
