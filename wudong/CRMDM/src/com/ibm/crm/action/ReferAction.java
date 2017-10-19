package com.ibm.crm.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.cond.biz.IReferBiz;
import com.ibm.crm.pojo.Crmrefer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ReferAction extends ActionSupport implements ModelDriven<Crmrefer>,RequestAware{

	IReferBiz referBiz;

	Crmrefer crmrefer = new Crmrefer();
	Map<String, Object> request;
	int pageCode = 1;
	public void setReferBiz(IReferBiz referBiz) {
		this.referBiz = referBiz;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	@Override
	public Crmrefer getModel() {
		// TODO Auto-generated method stub
		return crmrefer ;
	}
	//分页查询咨询表
	public String queryRefer() throws Exception {
		Map map = (Map)request.get("params");
		PageBean pb = referBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("pageBean", pb);
		return "queryReferSuccess";
	}

	//根据ID查找咨询表
	public String findReferStudent1() throws Exception{

		Crmrefer findRefer = referBiz.findById(crmrefer.getReferId());
		request.put("refer", findRefer);
		return"findReferStudent1Success";
	}

	public String find() throws Exception{
		Crmrefer findRefer = referBiz.findById(crmrefer.getReferId());
		request.put("refer", findRefer);
		return"findReferSuccess";
	}
	//根据ID查找咨询表后更新
	public String findReferStudent2() throws Exception{
		Crmrefer findRefer = referBiz.findById(crmrefer.getReferId());
		request.put("refer", findRefer);
		return"findReferStudent2Success";
	}
	//更新
	public String updateReferStudent() throws Exception{
		if(referBiz.modifyRefer(crmrefer)){
			return "updateReferStudentSuccess";
		}
		else{
			return "updateReferStudentError";
		}
	}
	private String condition;
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String search() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		if(condition != "" && condition.length() > 0){
			map.put("condition", condition);
		}
		PageBean pb = referBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("studentName", crmrefer.getStudentName());
		request.put("qq", crmrefer.getQq());	
		request.put("telephone", crmrefer.getTelephone());
		request.put("pageBean", pb);
		return "searchReferSuccess";
	}

}
