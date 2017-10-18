package com.ibm.crm.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.biz.IDeptBiz;
import com.ibm.crm.biz.IPostBiz;
import com.ibm.crm.biz.IStaffBiz;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;
import com.ibm.crm.vo.Crmstaff;
import com.opensymphony.xwork2.ModelDriven;


public class StaffAction implements ModelDriven<Crmstaff>,RequestAware {

	Crmstaff crmStaff = new Crmstaff();
	IStaffBiz staffBiz;
	IPostBiz postBiz;
	IDeptBiz deptBiz;
	int depId;
	int postId;
	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public void setPostBiz(IPostBiz postBiz) {
		this.postBiz = postBiz;
	}

	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

	public void setCtmStaff(Crmstaff crmStaff) {
		this.crmStaff = crmStaff;
	}

	public void setStaffBiz(IStaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}

	Map<String,Object> request;


	

	//查询所有职务
	public String all() throws Exception {
		// TODO Auto-generated method stub
		List<Crmpost> postList = postBiz.searchAllPost();
		List<Crmdepartment> deptList = deptBiz.findAllDept();
		request.put("dept", deptList);
		request.put("post", postList);
		return "findAllPostSuccess";
	}

	//添加员工
	public String addStaff() throws Exception {
		Crmdepartment cd = deptBiz.findById(depId);
		Crmpost cp = postBiz.checkById(postId);
		System.out.println(cd.getDepName());
		crmStaff.getCrmpost().setCrmdepartment(cd);
		crmStaff.setCrmpost(cp);
		if (staffBiz.regist(crmStaff)) {
			return "addStaffSuccess";
		} else{
			return "addPostError";
		}


	}

	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	@Override
	public Crmstaff getModel() {
		// TODO Auto-generated method stub
		return crmStaff;
	}

}