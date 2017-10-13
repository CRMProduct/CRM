package com.ibm.crm.biz;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.dao.IPostDao;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;


@Transactional(readOnly=true)	
public class PostBiz implements IPostBiz {

	IPostDao postDao;
	
	

	public void setPostDao(IPostDao postDao) {
		this.postDao = postDao;
	}

	@Override
	public Crmpost checkById(int postId) {
		// TODO Auto-generated method stub
		return postDao.findById(postId);
	}
	@Transactional(readOnly=true)	
	@Override
	public boolean updatePost(Crmpost crmpost) {
		// TODO Auto-generated method stub
		return postDao.modifyPost(crmpost);
	}
	
	


}
	
	
	
