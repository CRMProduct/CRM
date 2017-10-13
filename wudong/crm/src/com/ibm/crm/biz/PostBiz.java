package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.dao.IPostDao;
import com.ibm.crm.vo.Crmpost;

@Transactional(readOnly = true)

public class PostBiz implements IPostBiz {

	IPostDao postDao;
	public void setPostDao(IPostDao postDao) {
		this.postDao = postDao;
	}
	@Transactional(readOnly = false)
	@Override
	public boolean registPost(Crmpost crmpost) {
		// TODO Auto-generated method stub
		//System.out.println(crmpost.getPostName());
		return postDao.addPost(crmpost);
		
	}

}
