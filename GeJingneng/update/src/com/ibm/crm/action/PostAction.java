package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.biz.IPostBiz;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends ActionSupport implements ModelDriven<Crmpost>,RequestAware{

	Crmpost crmpost =new Crmpost();
	Map<String, Object> request;
	
	IPostBiz postBiz;

	
	public void setPostBiz(IPostBiz postBiz) {
		this.postBiz = postBiz;
	}

	@Override
	public Crmpost getModel() {
		// TODO Auto-generated method stub
		return crmpost;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	
	//根据部门ID查找到部门信息

	public String find() throws Exception {
		
		Crmpost findCrmpost = postBiz.checkById(crmpost.getPostId());
		request.put("crmPost", findCrmpost);
		return "findSuccess";
		
		
	}
	//更新职务
	public String update() throws Exception {
		
		if(postBiz.updatePost(crmpost)){
			return"updateSuccess";
		}else{
			return"updateError";
		}
		
	}
	
}
