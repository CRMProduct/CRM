package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.dole.biz.IGraduateBiz;
import com.ibm.crm.pojo.Crmclass;
import com.ibm.crm.pojo.Crmgraduate;
import com.ibm.crm.pojo.Crmstudent;
import com.ibm.crm.stu.biz.IStudentBiz;
import com.ibm.crm.td.biz.IClassBiz;
import com.opensymphony.xwork2.ModelDriven;

public class GraduateAction implements ModelDriven<Crmgraduate>,RequestAware {

	IGraduateBiz graduateBiz;
	IStudentBiz studentBiz;
	IClassBiz classBiz;
	int classId;
	int studentId;
	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentBiz(IStudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}

	public void setClassBiz(IClassBiz classBiz) {
		this.classBiz = classBiz;
	}

	Map<String, Object> request;
	Crmgraduate crmGraduate = new Crmgraduate();
	int pageCode = 1;

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	public Crmgraduate getCrmGraduate() {
		return crmGraduate;
	}

	public void setCrmGraduate(Crmgraduate crmGraduate) {
		this.crmGraduate = crmGraduate;
	}

	public void setGraduateBiz(IGraduateBiz graduateBiz) {
		this.graduateBiz = graduateBiz;
	}

	//添加就业信息
	public String addGraduate() throws Exception {
		Crmclass cc = classBiz.queryClass(classId);
		Crmstudent ct = studentBiz.queryById(studentId);
		System.out.println(classId+" "+studentId);
		crmGraduate.setCrmclass(cc);
		crmGraduate.setCrmstudent(ct);
		if (graduateBiz.regist(crmGraduate)) {
			return "addGraduateSuccess";
		} else{
			return "addGraduateError";
		}
	}

	//就业信息分页
	public String queryGraduate() throws Exception {
		Map map = (Map) request.get("param");
		PageBean pb = graduateBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("pageBean", pb);
		return "queryGraduateSuccess";
	}

	@Override
	public Crmgraduate getModel() {
		// TODO Auto-generated method stub
		return crmGraduate;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

}
