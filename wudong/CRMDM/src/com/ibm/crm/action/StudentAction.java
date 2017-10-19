package com.ibm.crm.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.cond.biz.IReferBiz;
import com.ibm.crm.pojo.Crmclass;
import com.ibm.crm.pojo.Crmrefer;
import com.ibm.crm.pojo.Crmstation;
import com.ibm.crm.pojo.Crmstudent;
import com.ibm.crm.stu.biz.IStationBiz;
import com.ibm.crm.stu.biz.IStudentBiz;
import com.ibm.crm.td.biz.IClassBiz;
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
	
	private Crmrefer refer = new Crmrefer();
	private String idendity;
	public Crmrefer getRefer() {
		return refer;
	}
	public void setRefer(Crmrefer refer) {
		this.refer = refer;
	}
	public String getIdendity() {
		return idendity;
	}
	public void setIdendity(String idendity) {
		this.idendity = idendity;
	}
	public String acquire() throws Exception {
		// TODO Auto-generated method stub
		request.put("studentName", refer.getStudentName());
		request.put("telephone", refer.getTelephone());
		request.put("qq", refer.getQq());
		System.out.println(refer.getQq());
		request.put("idendity", idendity);
		return "acquireSuccess";
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
	
	public String find1() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent findStudent = studentBiz.queryById(crmStudent.getStudentId());
		request.put("stu", findStudent);
		return "find1StudentSuccess";
	}
	
	public String find2() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent findStudent = studentBiz.queryById(crmStudent.getStudentId());
		request.put("stu", findStudent);
		return "find2StudentSuccess";
	}
	
	public String find3() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent findStudent = studentBiz.queryById(crmStudent.getStudentId());
		request.put("stu", findStudent);
		return "find3StudentSuccess";
	}
	
	public String find4() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent findStudent = studentBiz.queryById(crmStudent.getStudentId());
		request.put("stu", findStudent);
		return "find4StudentSuccess";
	}
	
	public String update() throws Exception {
		// TODO Auto-generated method stub
		//classId没有获取重现set进去
		Crmclass cc = classBiz.queryClass(classId);
		Crmrefer cf = referBiz.findById(referId);
		crmStudent.setCrmclass(cc);
		crmStudent.setCrmrefer(cf);
		if(studentBiz.modify(crmStudent)){
			return "updateStudentSuccess";
		}else{
			return "updateStudentError";
		}
	}
	
	public void setReferBiz(IReferBiz referBiz) {
		this.referBiz = referBiz;
	}

	String flag;
	String courseName;
	String className;
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	private int afterClassId;
	public int getAfterClassId() {
		return afterClassId;
	}
	public void setAfterClassId(int afterClassId) {
		this.afterClassId = afterClassId;
	}
	
	IClassBiz classBiz;
	IReferBiz referBiz;
	public void setClassBiz(IClassBiz classBiz) {
		this.classBiz = classBiz;
	}
	IStationBiz stationBiz;
	public void setStationBiz(IStationBiz stationBiz) {
		this.stationBiz = stationBiz;
	}

	private Crmstation crmStation = new Crmstation();
	public String change() throws Exception {
		// TODO Auto-generated method stub
		Crmstudent student = studentBiz.queryById(crmStudent.getStudentId());
		Crmclass beforeClass = classBiz.queryClass(classId);
		Crmclass afterClass = classBiz.queryClass(afterClassId);
		if(flag.equals("升级")){
			int upgradeCount = beforeClass.getUpgradeCount();
			beforeClass.setUpgradeCount(++upgradeCount);
			classBiz.modifyClass(beforeClass);
			crmStation.setAfterClassId(afterClassId);
			crmStation.setBeforeClassId(classId);
			Date date = new Date();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String createDate = df.format(date);
			crmStation.setCreateDate(createDate);
			crmStation.setFlag("1");
			crmStation.setCrmstudent(student);
			crmStation.setStaffId(1);
			stationBiz.regist(crmStation);
		}
		if(flag.equals("转班")){
			int beforeTotalCount = beforeClass.getTotalCount();
			beforeClass.setTotalCount(--beforeTotalCount);
			classBiz.modifyClass(beforeClass);
			int afterTotalCount = afterClass.getTotalCount();
			afterClass.setTotalCount(++afterTotalCount);
			classBiz.modifyClass(afterClass);
			crmStation.setAfterClassId(afterClassId);
			crmStation.setBeforeClassId(classId);
			Date date = new Date();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String createDate = df.format(date);
			crmStation.setCreateDate(createDate);
			crmStation.setFlag("1");
			crmStation.setCrmstudent(student);
			crmStation.setStaffId(1);
			stationBiz.regist(crmStation);
		}
		return "changeSuccess";
	}

}
