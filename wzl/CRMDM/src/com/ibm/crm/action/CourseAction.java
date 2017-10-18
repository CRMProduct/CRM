package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmcoursetype;
import com.ibm.crm.td.biz.ICourseBiz;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CourseAction extends ActionSupport implements ModelDriven<Crmcoursetype>, RequestAware {
	private int pageCode=1;
	ICourseBiz courseBiz;

	public void setCourseBiz(ICourseBiz courseBiz) {
		this.courseBiz = courseBiz;
	}

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	private Crmcoursetype crmcoursetype = new Crmcoursetype();
	Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public Crmcoursetype getModel() {
		// TODO Auto-generated method stub
		return crmcoursetype;
	}

	public String addCourse() throws Exception {
		if (courseBiz.registCourse(crmcoursetype)) {
			return "addCourseSuccess";
		} else {
			return "addCourseError";
		}

	}
	public String queryCourse() throws Exception {
		// TODO Auto-generated method stub
		PageBean pb = courseBiz.queryByPage(pageCode, ApplicationContext.pageSize);
		request.put("pageBean", pb);
		return "queryCourseSuccess" ;
	}
	//根据ID查询课程类别
	
	public String findCourse() throws Exception{
		
    Crmcoursetype findCrmcoursetype = courseBiz.checkById(crmcoursetype.getCourseTypeId());
		request.put("course",findCrmcoursetype);
		return"findCourseSuccess";
	
	}	
	//更新课程类别
	public String updateCourse() throws Exception{
		if(courseBiz.modifyCourse(crmcoursetype)){
			return"updateCourseSuccess";
		}else{
			return"updateCourseError";
		}
		

}
}
