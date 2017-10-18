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

public class StaffAction implements ModelDriven<Crmstaff>, RequestAware {

	Crmstaff crmStaff = new Crmstaff();
	IStaffBiz staffBiz;
	IPostBiz postBiz;
	IDeptBiz deptBiz;
	int depId;
	int postId;
	int pageCode = 1;


	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
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
	Map<String,Object> session;
	Map<String,Object> request;




	//查询所有职务
	public String all() throws Exception {
		// TODO Auto-generated method stub
		List<Crmpost> postList = postBiz.searchAllPost();
		List<Crmdepartment> deptList = deptBiz.findAllDept();
		request.put("dept", deptList);
		request.put("post", postList);
		
			return "findAllPostSuccess";
		
		
	}

	//添加员工
	public String addStaff() throws Exception {
		Crmdepartment cd = deptBiz.findById(depId);
		Crmpost cp = postBiz.checkById(postId);
		cp.setCrmdepartment(cd);
		System.out.println(crmStaff.getLoginName());
		crmStaff.setCrmpost(cp);
		System.out.println(crmStaff.getStaffId());
		if (staffBiz.regist(crmStaff) != null) {
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

	//职务分页
	public String query() throws Exception {
		// TODO Auto-generated method stub
		Map map = (Map) request.get("param");
		PageBean pb = staffBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);

		/*List<Crmpost> s = pb.getList();
			List<Crmpost> sNew = new ArrayList<Crmpost>();
			Iterator<Crmpost> iter = s.iterator();

			while(iter.hasNext()){

				Crmpost cp = iter.next();
				Crmdepartment cd = cp.getCrmdepartment();
				Crmdepartment cNew = deptBiz.findById(cd.getDepId());
				cp.setCrmdepartment(cNew);
				sNew.add(cp);

			}
			pb.setList(sNew);*/
		request.put("pageBean", pb);
		return "queryStaffSuccess";
	}

	//更新
		public String update() throws Exception {
			Crmdepartment cd = deptBiz.findById(depId);
			Crmpost cp = postBiz.checkById(postId);
			/*cp.setCrmdepartment(cd);*/
			crmStaff.setCrmpost(cp);
			if(staffBiz.modifyStaff(crmStaff)){
				return"updateStaffSuccess";
			}else{
				return"updateError";
			}

		}

	//查询职务
	public String find() throws Exception {
		// TODO Auto-generated method stub
		Crmstaff cs = staffBiz.searchById(crmStaff.getStaffId());
		Crmpost cp = postBiz.checkById(cs.getCrmpost().getPostId());
		Crmdepartment cd = deptBiz.findById(cp.getCrmdepartment().getDepId());
		cp.setCrmdepartment(cd);
		cs.setCrmpost(cp);
		request.put("staff", cs);
		
		List<Crmpost> postList = postBiz.searchAllPost();
		List<Crmdepartment> deptList = deptBiz.findAllDept();
		request.put("dept", deptList);
		request.put("post", postList);
		return "findStaffSuccess";

	}
	public String login() throws Exception {
		Crmstaff crmstaff = staffBiz.check(crmStaff.getLoginName(), crmStaff.getLoginPwd());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
		String systemTime = sdf.format(date);
		if (crmstaff != null) {
			session = ActionContext.getContext().getSession();
			session.put("loginName", crmStaff.getLoginName());
			request.put("systemTime", systemTime);
			return "loginSuccess";
		} else {
			return "loginError";
		}
	}

}