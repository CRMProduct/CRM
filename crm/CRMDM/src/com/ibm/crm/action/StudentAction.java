package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstudent;
import com.ibm.crm.stu.biz.IStudentBiz;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Crmstudent>,RequestAware {

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	private Crmstudent crmStudent = new Crmstudent();
	@Override
	public Crmstudent getModel() {
		// TODO Auto-generated method stub
		return crmStudent;
	}
	
	IStudentBiz studentBiz;
	public void setStudentBiz(IStudentBiz studentBiz) {
		this.studentBiz = studentBiz;
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
		Map map = (Map)request.get("params");
		PageBean pb = studentBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("pageBean", pb);
		return "queryStudentSuccess";
	}
	private int classId;
	private int referId;
	
	 public int getClassId() {
		return classId;
	}
	public int getReferId() {
		return referId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public void setReferId(int referId) {
		this.referId = referId;
	}

	public String regist() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent registStudent = studentBiz.regist(crmStudent);
		if(registStudent != null){
			/*Crmclass crmClass = registStudent.getCrmclass();
			int totalCount = crmClass.getTotalCount();
			crmClass.setTotalCount(++totalCount);
			//更新班级人数的总数（整合的时候的填上）
*/			
			return "registStudentSuccess";
		}else{
			return "registStudentError";
		}
	}
	
	public String find() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent findStudent = studentBiz.queryById(crmStudent.getStudentId());
		request.put("stu", findStudent);
		return "findStudentSuccess";
	}
	
	public String update() throws Exception {
		// TODO Auto-generated method stub
		if(studentBiz.modify(crmStudent)){
			return "updateStudentSuccess";
		}else{
			return "updateStudentError";
		}
	}

}
