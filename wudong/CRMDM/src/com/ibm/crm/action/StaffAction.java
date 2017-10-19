package com.ibm.crm.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.hr.biz.IDeptBiz;
import com.ibm.crm.hr.biz.IPostBiz;
import com.ibm.crm.hr.biz.IStaffBiz;
import com.ibm.crm.pojo.Crmdepartment;
import com.ibm.crm.pojo.Crmpost;
import com.ibm.crm.pojo.Crmstaff;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;


public class StaffAction implements ModelDriven<Crmstaff>,RequestAware {

	Crmstaff crmStaff = new Crmstaff();
	IStaffBiz staffBiz;
	IPostBiz postBiz;
	IDeptBiz deptBiz;
	int depId;
	int postId;
	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public void setPostBiz(IPostBiz postBiz) {
		this.postBiz = postBiz;
	}

	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

	public void setCtmStaff(Crmstaff crmStaff) {
		this.crmStaff = crmStaff;
	}

	public void setStaffBiz(IStaffBiz staffBiz) {
		this.staffBiz = staffBiz;
	}

	Map<String,Object> request;
	Map<String,Object> session;

	public String login() throws Exception {
		Crmstaff crmstaff = staffBiz.check(crmStaff.getLoginName(), crmStaff.getLoginPwd());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
		String systemTime = sdf.format(date);
		if (crmstaff != null) {
			session = ActionContext.getContext().getSession();
			session.put("staffName", crmstaff.getStaffName());
			session.put("systemTime", systemTime);
			return "loginSuccess";
		} else {
			return "loginError";
		}
	}
	

	//查询所有职务
	/*public String all() throws Exception {
		// TODO Auto-generated method stub
		List<Crmpost> postList = postBiz.searchAllPost();
		List<Crmdepartment> deptList = deptBiz.findAllDept();
		request.put("dept", deptList);
		request.put("post", postList);
		return "findAllPostSuccess";
	}
*/
	//添加员工
	public String addStaff() throws Exception {
		Crmdepartment cd = deptBiz.findById(depId);
		Crmpost cp = postBiz.checkById(postId);
		System.out.println(cd.getDepName());
		crmStaff.getCrmpost().setCrmdepartment(cd);
		crmStaff.setCrmpost(cp);
		if (staffBiz.regist(crmStaff)) {
			return "addStaffSuccess";
		} else{
			return "addPostError";
		}


	}

	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	@Override
	public Crmstaff getModel() {
		// TODO Auto-generated method stub
		return crmStaff;
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
        PageBean pb = staffBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
      /*  List<Crmstaff> list = pb.getList();
        List<Crmstaff> staff = new ArrayList<Crmstaff>();
        Iterator<Crmstaff> iter = list.iterator();
        while(iter.hasNext()){
        	Crmstaff s = iter.next();
        	int postId = s.getCrmpost().getPostId();
        	Crmpost p = postBiz.checkById(postId);
        	s.setCrmpost(p);
        	int depId = p.getCrmdepartment().getDepId();
        	Crmdepartment deptment = deptBiz.findById(depId);
        	p.setCrmdepartment(deptment);
        	staff.add(s);
        }
        pb.setList(staff);*/
        request.put("pageBean", pb);
        return "queryStaffSuccess";
	}
	
	String depName;
	String postName;
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	
	public String search() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		if(depName != "" && depName.length() > 0){
			map.put("depName", depName);
		}
		if(postName != "" && postName.length() > 0){
			map.put("postName", postName);
		}
		if(crmStaff.getStaffName() != "" && crmStaff.getStaffName().length() > 0){
			map.put("staffName", crmStaff.getStaffName());
		}
		PageBean pb = staffBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("depName", depName);
		request.put("postName", postName);	
		request.put("staffName", crmStaff.getStaffName());
		request.put("pageBean", pb);
		return "searchStaffSuccess";
	}
	
	
	public String find() throws Exception {
		crmStaff = staffBiz.searchById(crmStaff.getStaffId());
		Crmpost findCrmpost = postBiz.checkById(crmStaff.getCrmpost().getPostId());
		Crmdepartment cp = deptBiz.findById(findCrmpost.getCrmdepartment().getDepId());
		findCrmpost.setCrmdepartment(cp);
		crmStaff.setCrmpost(findCrmpost);
		request.put("staff", crmStaff);
		return "findStaffSuccess";


	}

}