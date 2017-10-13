package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import com.ibm.crm.biz.IPostBiz;
import com.ibm.crm.vo.Crmpost;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends ActionSupport implements ModelDriven<Crmpost>, RequestAware {

	private int pageCode;
	private Crmpost crmpost = new Crmpost();
	Map<String, Object> request;
	IPostBiz postBiz;
	
	public void setPostBiz(IPostBiz postBiz) {
		this.postBiz = postBiz;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	@Override
	public Crmpost getModel() {
		// TODO Auto-generated method stub
		return crmpost;
	}

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}


	public String addPost() throws Exception {
		
		System.out.println(crmpost.getPostName());
		if (postBiz.registPost(crmpost)) {
			return "addPostSuccess";
		} else {
			return "addPostError";
		}
	}

}
