package com.ibm.crm.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.biz.IDeptBiz;
import com.ibm.crm.biz.IPostBiz;
import com.ibm.crm.vo.Crmdepartment;
import com.ibm.crm.vo.Crmpost;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction implements RequestAware,ModelDriven<Crmpost>{

	Map<String, Object> request;
	Crmpost crmPost = new Crmpost();
	IDeptBiz deptBiz;
	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}

	int depId;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	IPostBiz  postBiz;
	int pageCode = 1;


	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	public void setPostBiz(IPostBiz postBiz) {
		this.postBiz = postBiz;
	}

	public Crmpost getCrmPost() {
		return crmPost;
	}

	public void setCrmPost(Crmpost crmPost) {
		this.crmPost = crmPost;
	}

	//职务分页
	public String query() throws Exception {
		// TODO Auto-generated method stub
		Map map = (Map) request.get("params");
		PageBean pb = postBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);

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
		return "queryPostSuccess";
	}

	//根据部门ID查找到职务信息

	public String find() throws Exception {

		Crmpost findCrmpost = postBiz.checkById(crmPost.getPostId());
		Crmdepartment cp = deptBiz.findById(findCrmpost.getCrmdepartment().getDepId());
		findCrmpost.setCrmdepartment(cp);
		request.put("crmPost", findCrmpost);

		List<Crmdepartment> deptList = deptBiz.findAllDept();
		request.put("dept",deptList);
		return "findPostSuccess";


	}
	//更新职务
	public String update() throws Exception {
		Crmdepartment cp = deptBiz.findById(depId);
		crmPost.setCrmdepartment(cp);
		if(postBiz.updatePost(crmPost)){
			return"updatePostSuccess";
		}else{
			return"updatePostError";
		}

	}

	//查询所有部门
	public String all() throws Exception {
		// TODO Auto-generated method stub
		List<Crmdepartment> deptList = deptBiz.findAllDept();
		request.put("dept",deptList);
		return "findAllSuccess";
	}

	//添加部门
	public String addPost() throws Exception {
		Crmdepartment cp = deptBiz.findById(depId);
		crmPost.setCrmdepartment(cp);
		if (postBiz.registPost(crmPost)) {
			return "addPostSuccess";
		} else{
			return "addPostError";
		}


	}

	@Override
	public Crmpost getModel() {
		// TODO Auto-generated method stub
		return crmPost;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
}
