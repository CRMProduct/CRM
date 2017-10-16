package com.ibm.crm.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.biz.IClassBiz;
import com.ibm.crm.biz.ICourseBiz;
import com.ibm.crm.vo.Crmclass;
import com.ibm.crm.vo.Crmcoursetype;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ClassAction extends ActionSupport implements ModelDriven<Crmclass>, RequestAware {
	private int pageCode = 1;
	IClassBiz classBiz;
	ICourseBiz courseBiz;
	int courseTypeId;
	
	public int getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(int courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public void setCourseBiz(ICourseBiz courseBiz) {
		this.courseBiz = courseBiz;
	}

	private int classId;

	public int getClassId() {
		return classId;
	}

	public void setClassID(int classId) {
		this.classId = classId;
	}

	public void setClassBiz(IClassBiz classBiz) {
		this.classBiz = classBiz;
	}

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	private Crmclass crmclass = new Crmclass();
	Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public Crmclass getModel() {
		// TODO Auto-generated method stub
		return crmclass;
	}

	public String addClass() throws Exception {
		if (classBiz.registClass(crmclass)) {
			return "addClassSuccess";
		} else {
			return "addClassError";
		}

	}

	public String findClass() throws Exception {
		Crmclass crmclass1 = classBiz.queryClass(crmclass.getClassId());
		List<Crmcoursetype> list = courseBiz.queryAllCourse();
		request.put("crmclass", crmclass1);
		request.put("course", list);
		return "findClassSuccess";

	}

	public String updateClass() throws Exception {
		Crmcoursetype cc = courseBiz.checkById(courseTypeId);
		crmclass.setCrmcoursetype(cc);
		if (classBiz.modifyClass(crmclass)) {
			return "updateClassSuccess";
		} else {
			return "updateClassError";
		}

	}

	// 分页
	public String queryClass() throws Exception {
		PageBean pb = classBiz.queryByPage(pageCode, ApplicationContext.pageSize);
		request.put("pageBean", pb);
		return "queryClassSuccess";
	}
	
}
