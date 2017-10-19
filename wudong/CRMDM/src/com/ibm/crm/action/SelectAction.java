package com.ibm.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.ibm.crm.base.Address;
import com.ibm.crm.hr.biz.IDeptBiz;
import com.ibm.crm.hr.biz.IPostBiz;
import com.ibm.crm.pojo.Crmdepartment;
import com.ibm.crm.pojo.Crmpost;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SelectAction extends ActionSupport {

	/**
	 * 
	 */
	IDeptBiz deptBiz ;
	IPostBiz postBiz ;
	
	public void setPostBiz(IPostBiz postBiz) {
		this.postBiz = postBiz;
	}
	private static final long serialVersionUID = 1L;

	String dep;
	String method;
	public String getDep() {
		return dep;
	}
	public String getMethod() {
		return method;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public void setMethod(String method) {
		this.method = method;
	}


	public void me(){
		String method = getMethod();
		if("dep".equals(method)){
			System.out.println("----------");
			try {
				findDept();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if("post".equals(method)){
			System.out.println("1111111111");
			try {
				findPost();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public String findDept() throws Exception{
		List<Crmdepartment> cp = deptBiz.findAllDept();
		ArrayList<Address> addrList = new ArrayList<Address>();
		for(int i = 0;i<cp.size();i++){
			Address addr = new Address();
			addr.setId(cp.get(i).getDepId());
			addr.setAddress(cp.get(i).getDepName());
			addrList.add(addr);
			System.out.println(addrList.get(i).getAddress());
		}
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(addrList);
		jsonObj.put("addrList", jsonArray);
		HttpServletResponse response = ServletActionContext.getResponse();  
		response.setContentType("text/html;charset=UTF-8");  
		response.getWriter().write(jsonObj.toString()); 
		return null;


	}

	public String findPost() throws Exception {

		String depId = getDep();

		List<Crmpost> cp =  postBiz.findByDeptId(Integer.parseInt(depId));
		
		ArrayList<Address> addrList = new ArrayList<Address>();
		for(int i = 0;i<cp.size();i++){
			Address addr = new Address();
			addr.setId(cp.get(i).getPostId());
			addr.setAddress(cp.get(i).getPostName());
			addrList.add(addr);
			System.out.println(addrList.get(i).getAddress());
		}

		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArray = JSONArray.fromObject(addrList);
		jsonObj.put("addrList", jsonArray);
		HttpServletResponse response = ServletActionContext.getResponse();  
		response.setContentType("text/html;charset=UTF-8");  
		response.getWriter().write(jsonObj.toString()); 
		return null;
	}
	public void setDeptBiz(IDeptBiz deptBiz) {
		this.deptBiz = deptBiz;
	}
	
	

}
