package com.ibm.crm.hr.biz;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.hr.dao.IPostDao;
import com.ibm.crm.pojo.Crmpost;
@Transactional(readOnly=true)
public class PostBiz implements IPostBiz {

	IPostDao postDao;
	public void setPostDao(IPostDao postDao) {
		this.postDao = postDao;
	}

	//分页
	@Override
	public PageBean queryByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		return postDao.findByPage(pageCode, pageSize, map);
	}

	//根据Id查询
	@Override
	public Crmpost checkById(int postId) {
		// TODO Auto-generated method stub
		return postDao.findById(postId);
	}

	//更新
	@Transactional(readOnly = false)	
	@Override
	public boolean updatePost(Crmpost crmpost) {
		// TODO Auto-generated method stub
		return postDao.modifyPost(crmpost);
	}

	//添加职务
	@Transactional(readOnly = false)
	@Override
	public boolean registPost(Crmpost crmpost) {
		// TODO Auto-generated method stub
		//System.out.println(crmpost.getPostName());
		return postDao.addPost(crmpost);

	}

}
