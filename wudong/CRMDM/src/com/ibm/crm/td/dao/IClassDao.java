package com.ibm.crm.td.dao;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmclass;

public interface IClassDao extends GenericDao<Crmclass, Integer> {
	public boolean addClass(Crmclass crmclass);

	public PageBean findByPage(int pageCode, int pageSize);

	public Crmclass findClass(int classId);

	public boolean updateClass(Crmclass crmclass);
	
	public int findclassId(String className);
}
