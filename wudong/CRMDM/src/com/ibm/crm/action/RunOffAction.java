package com.ibm.crm.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrunoff;
import com.ibm.crm.pojo.Crmstudent;
import com.ibm.crm.stu.biz.IRunOffBiz;
import com.ibm.crm.stu.biz.IStudentBiz;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RunOffAction extends ActionSupport implements RequestAware,ModelDriven<Crmrunoff>{

	Map<String, Object> request;
	IStudentBiz studentBiz;
	public void setStudentBiz(IStudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}
	public Crmrunoff getCrmRunOff() {
		return crmRunOff;
	}
	public void setCrmRunOff(Crmrunoff crmRunOff) {
		this.crmRunOff = crmRunOff;
	}

	Crmrunoff crmRunOff = new Crmrunoff();
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	IRunOffBiz runOffBiz;
	public void setRunOffBiz(IRunOffBiz runOffBiz) {
		this.runOffBiz = runOffBiz;
	}
	
	private int pageCode = 1;
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	
	public String query() throws Exception {
		// TODO Auto-generated method stub
		PageBean pb = runOffBiz.queryByPage(pageCode, ApplicationContext.pageSize);
		request.put("pageBean", pb);
		return "queryRunOffSuccess";
	}
	
	private int studentId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String add() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent crmstudent = studentBiz.queryById(studentId);
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String createDate = df.format(date);
		crmRunOff.setCreateDate(createDate);
		crmRunOff.setCrmstudent(crmstudent);
		runOffBiz.regist(crmRunOff);
		return "addRunOffSuccess";
	}
	
	
	
	@Override
	public Crmrunoff getModel() {
		// TODO Auto-generated method stub
		return crmRunOff;
	}
	

}
