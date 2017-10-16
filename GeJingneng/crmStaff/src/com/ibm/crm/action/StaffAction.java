package com.ibm.crm.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.biz.IStaffBiz;
import com.ibm.crm.vo.Crmstaff;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class StaffAction extends ActionSupport implements ModelDriven<Crmstaff>,RequestAware {

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	private Crmstaff crmstaff = new Crmstaff();
	@Override
	public Crmstaff getModel() {
		// TODO Auto-generated method stub
		return crmstaff;
	}

	IStaffBiz staffBiz;
	public void setStaffBiz(IStaffBiz staffBiz) {
		this.staffBiz = staffBiz;
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
		if(crmstaff.getStaffName() != "" && crmstaff.getStaffName().length() > 0){
			map.put("staffName", crmstaff.getStaffName());
		}
		PageBean pb = staffBiz.queryByPage(pageCode, ApplicationContext.pageSize, map);
		request.put("depName", depName);
		request.put("postName", postName);	
		request.put("staffName", crmstaff.getStaffName());
		
		return "searchStaffSuccess";
	}
	
}
