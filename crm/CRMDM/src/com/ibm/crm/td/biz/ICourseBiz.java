package com.ibm.crm.td.biz;

import java.util.List;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmcoursetype;

public interface ICourseBiz {
	public boolean registCourse(Crmcoursetype crmcoursetype);

	public PageBean queryByPage(int pageCode, int pageSize);

	public Crmcoursetype checkById(int courseTypeId);

	public boolean modifyCourse(Crmcoursetype crmcoursetype);
	
	public List<Crmcoursetype> queryAllCourse();
}
