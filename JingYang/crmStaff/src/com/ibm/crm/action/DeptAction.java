package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.biz.IDeptBiz;
import com.ibm.crm.vo.Crmdepartment;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeptAction extends ActionSupport implements ModelDriven<Crmdepartment>,RequestAware{

	Crmdepartment department =new Crmdepartment();
	Map<String, Object> request;
	
	IDeptBiz deptBiz;

	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

	@Override
	public Crmdepartment getModel() {
		// TODO Auto-generated method stub
		return department;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	
	//添加部门
	
	public String regist() throws Exception {
		if(deptBiz.registDepartment(department)){
			return"registSuccess";
		}
		return "registError";
	}
	
}
