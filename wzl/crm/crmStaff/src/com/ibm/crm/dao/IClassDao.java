package com.ibm.crm.dao;

import java.util.List;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.vo.Crmclass;

public interface IClassDao extends GenericDao<Crmclass, Integer>{


	//查询单个
	public Crmclass findByClassId(int classId);
}
