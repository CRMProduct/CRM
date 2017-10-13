package com.ibm.crm.biz;

import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmdepartment;

public interface IDeptBiz {
	
	//分页
	public PageBean queryByPage(int pageCode, int pageSize, Map map);
	
	//根据Id查询
	public Crmdepartment findById(int depId);
		
	//更新
	public Crmdepartment modifyDept(Crmdepartment crmdepartment);
}
