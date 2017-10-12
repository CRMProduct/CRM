package com.ibm.crm.biz;

import org.junit.Test;

import com.ibm.crm.dao.DeptDao;
import com.ibm.crm.dao.IDeptDao;
import com.ibm.vo.Crmdepartment;

public class TestDept {
	IDeptBiz db = new DeptBiz();
	IDeptDao dd = new DeptDao();
	
	@Test
	public void testUpDept()throws Exception{
		Crmdepartment c = db.srhDeptById(2);
		System.out.println("-----");
		/*c.setDepName("咨询");
		c = db.modifyDept(c);*/
	}
}
