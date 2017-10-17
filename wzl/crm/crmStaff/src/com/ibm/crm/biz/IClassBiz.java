package com.ibm.crm.biz;

import java.util.List;

import com.ibm.crm.vo.Crmclass;

public interface IClassBiz  {
	
	//查询所有
	public List<Crmclass> findAllClass();
	
	//查询单个
	public Crmclass findByClassId(int classId);
}
