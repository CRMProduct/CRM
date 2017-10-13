package com.ibm.crm.biz;

import com.ibm.crm.vo.Crmpost;

public interface IPostBiz {

	public Crmpost checkById(int postId);
	
	public boolean updatePost(Crmpost crmpost);
	
}
