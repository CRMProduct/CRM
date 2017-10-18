package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.hr.biz.IDeptBiz;
import com.ibm.crm.pojo.Crmdepartment;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeptAction extends ActionSupport implements ModelDriven<Crmdepartment>,RequestAware {

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> reqest) {
		// TODO Auto-generated method stub
		this.request = reqest;
	}

	private Crmdepartment crmDepartment = new Crmdepartment();
	@Override
	public Crmdepartment getModel() {
		// TODO Auto-generated method stub
		return crmDepartment;
	}

	IDeptBiz deptBiz;
	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

	//页码
	private int pageCode;
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	//分页
	public String query() throws Exception {
		// TODO Auto-generated method stub
		Map map = (Map)request.get("params");
		PageBean pb = deptBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("pageBean", pb);
		return "queryDeptSuccess";
	}
	//添加部门
	public String regist() throws Exception {
		if(deptBiz.registDepartment(crmDepartment)){
			return"registDeptSuccess";
		}
		return "registDeptError";
	}

	//登录
	public String login() throws Exception {
		return "loginSuccess";
	}
	
	//根据ID查询部门
	public String find() throws Exception {
		// TODO Auto-generated method stub
		Crmdepartment findDepartment = deptBiz.findById(crmDepartment.getDepId());
		request.put("crmDepartment", findDepartment);
		return "findDeptSuccess";
	}
	
	//更新部门信息
	public String update() throws Exception {
		// TODO Auto-generated method stub
		Crmdepartment updateDepartment = deptBiz.modifyDept(crmDepartment);
		if(updateDepartment != null){
			return "updateDeptSuccess";
		}else{
			return "updateDeptError";
		}
	}
}
