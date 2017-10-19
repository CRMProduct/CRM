package com.ibm.crm.action;

import java.util.HashMap;
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
		Map map = (Map)request.get("params");
		PageBean pb = courseBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
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
	
	private int total1;
	private int total2;
	public int getTotal1() {
		return total1;
	}
	public void setTotal1(int total1) {
		this.total1 = total1;
	}
	public int getTotal2() {
		return total2;
	}
	public void setTotal2(int total2) {
		this.total2 = total2;
	}
	private int courseCost1;
	private int courseCost2;
	public int getCourseCost1() {
		return courseCost1;
	}
	public void setCourseCost1(int courseCost1) {
		this.courseCost1 = courseCost1;
	}
	public int getCourseCost2() {
		return courseCost2;
	}
	public void setCourseCost2(int courseCost2) {
		this.courseCost2 = courseCost2;
	}

	public String search() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		if(crmcoursetype.getCourseName() != "" && crmcoursetype.getCourseName().length() > 0){
			map.put("courseName", crmcoursetype.getCourseName());
		}
		if(crmcoursetype.getRemark() != "" && crmcoursetype.getRemark().length() > 0){
			map.put("remark", crmcoursetype.getRemark());
		}
		/*if(total1 >= 0 && total2 > total1){
			map.put("total1", total1);
			map.put("total2", total2);
		}
		if(courseCost1 >= 0 && courseCost2 >= courseCost1){
			map.put("courseCost1", courseCost1);
			map.put("courseCost2", courseCost2);
		}*/
		PageBean pb = courseBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("courseName", crmcoursetype.getCourseName());
		request.put("remark", crmcoursetype.getRemark());	
		request.put("total1", total1);
		request.put("total2", total2);
		request.put("courseCost1", courseCost1);
		request.put("courseCost2", courseCost2);
		request.put("pageBean", pb);
		return "searchCourseSuccess";
	}
}
