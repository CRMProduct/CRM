package com.ibm.crm.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ibm.crm.base.ApplicationContext;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmclass;
import com.ibm.crm.pojo.Crmstation;
import com.ibm.crm.stu.biz.IStationBiz;
import com.ibm.crm.td.biz.IClassBiz;
import com.opensymphony.xwork2.ActionSupport;

public class StationAction extends ActionSupport implements RequestAware {

	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	IStationBiz stationBiz;
	public void setStationBiz(IStationBiz stationBiz) {
		this.stationBiz = stationBiz;
	}

	private int pageCode = 1;
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	
	IClassBiz classBiz;
	public void setClassBiz(IClassBiz classBiz) {
		this.classBiz = classBiz;
	}
	
	public String query() throws Exception {
		// TODO Auto-generated method stub
		PageBean pb = stationBiz.queryByPage(pageCode, ApplicationContext.pageSize);
		request.put("pageBean", pb);
		List<Crmstation> list = pb.getList();
		Iterator<Crmstation> iter = list.iterator();
		while(iter.hasNext()){
			Crmstation station = iter.next();
			Crmclass beforeClass = classBiz.queryClass(station.getBeforeClassId());
			request.put("beforeClassName", beforeClass.getClassName());
			Crmclass afterClass = classBiz.queryClass(station.getAfterClassId());
			request.put("afterClassName", afterClass.getClassName());
		}
		return "queryStationSuccess";
	}
}
