package com.ibm.crm.stu.biz;

import java.util.Map;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstudent;

public interface IStudentBiz {
	
	public PageBean queryByPage(int pageCode, int pageSize, Map map);
	
	public Crmstudent regist(Crmstudent student);
	
	public Crmstudent queryById(int studentId);
	
	public boolean modify(Crmstudent student);

}
