package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.biz.IDeptBiz;
import com.ibm.crm.vo.Crmdepartment;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeptAction extends ActionSupport implements ModelDriven<Crmdepartment>,RequestAware {

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> reqest) {
		// TODO Auto-generated method stub
		this.request = reqest;
	}

	private Crmdepartment crmDepartMent = new Crmdepartment();
	@Override
	public Crmdepartment getModel() {
		// TODO Auto-generated method stub
		return crmDepartMent;
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
	
	
	public String find() throws Exception {
		// TODO Auto-generated method stub
		crmDepartMent = deptBiz.findById(crmDepartMent.getDepId());
		request.put("crmDepartment", crmDepartMent);
		return "findSuccess";
	}
	
	public String update() throws Exception {
		// TODO Auto-generated method stub
		crmDepartMent = deptBiz.modifyDept(crmDepartMent);
		if(crmDepartMent != null){
			
			return "findSuccess";
		}else{
			return "error";
		}
	}

	//分页
	public String query() throws Exception {
		// TODO Auto-generated method stub
		Map map = (Map)request.get("params");
		PageBean pb = deptBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("pageBean", pb);
		return "querySuccess";
	}

}
