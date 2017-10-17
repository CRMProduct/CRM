package com.ibm.crm.base;

import java.util.ArrayList;
import java.util.List;

import com.ibm.crm.vo.Crmclass;


public class PageBean {

	private int pageCode;
	private int pageSize;
	private int allPages;
	private int allCount;
	List list = new ArrayList();
	public PageBean() {
		// TODO Auto-generated constructor stub
	}
	
	public PageBean(int pageCode, int pageSize, int allPages, int allCount, List list) {
		super();
		this.pageCode = pageCode;
		this.pageSize = pageSize;
		this.allPages = allPages;
		this.allCount = allCount;
		this.list = list;
	}
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getAllPages() {
		return allPages;
	}
	public void setAllPages(int allPages) {
		this.allPages = allPages;
	}
	public int getAllCount() {
		return allCount;
	}
	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
