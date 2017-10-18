package com.ibm.crm.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.cond.biz.IReferBiz;
import com.ibm.crm.pojo.Crmrefer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ReferAction extends ActionSupport implements ModelDriven<Crmrefer>,RequestAware{
	
	IReferBiz referBiz;
	
	Crmrefer crmrefer = new Crmrefer();
	Map<String, Object> request;
    int pageCode = 1;
	public void setReferBiz(IReferBiz referBiz) {
		this.referBiz = referBiz;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	@Override
	public Crmrefer getModel() {
		// TODO Auto-generated method stub
		return crmrefer ;
	}
     //分页查询咨询表
    public String queryRefer() throws Exception {
    	PageBean pb = referBiz.queryByPage(pageCode, ApplicationContext.pageSize);
    	request.put("pageBean", pb);
    	return "queryReferSuccess";
    }
    
    //根据ID查找咨询表
    public String findReferStudent1() throws Exception{
    	
    	Crmrefer findRefer = referBiz.findById(crmrefer.getReferId());
    	request.put("refer", findRefer);
    	return"findReferStudent1Success";
    }
  //根据ID查找咨询表后更新
    public String findReferStudent2() throws Exception{
    	Crmrefer findRefer = referBiz.findById(crmrefer.getReferId());
    	request.put("refer", findRefer);
    	return"findReferStudent2Success";
    }
    //更新
    public String updateReferStudent() throws Exception{
    	if(referBiz.modifyRefer(crmrefer)){
    		return "updateReferStudentSuccess";
    	}
    	else{
    		return "updateReferStudentError";
    	}
    	
		
    	
    }
    
}
