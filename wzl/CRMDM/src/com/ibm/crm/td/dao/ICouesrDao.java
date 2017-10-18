package com.ibm.crm.td.dao;

import java.util.List;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmcoursetype;

public interface ICouesrDao extends GenericDao<Crmcoursetype, Integer> {
	public boolean addCourse(Crmcoursetype crmcoursetype);

	public PageBean findByPage(int pageCode, int pageSize);

	public Crmcoursetype findById(int courseTypeId);

	public boolean updateCourse(Crmcoursetype crmcoursetype);
	
	public List<Crmcoursetype> findAllCourse();

}
