package com.ibm.crm.dao;

<<<<<<< HEAD
import java.util.Map;

import com.ibm.crm.base.GenericDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment, Integer> {
	
	//分页
	public PageBean findByPage(int pageCode, int pageSize, Map map);

=======
import com.ibm.crm.base.GenericDao;
import com.ibm.vo.Crmdepartment;

public interface IDeptDao extends GenericDao<Crmdepartment, Integer> {
	//根据Id查找部门
	public Crmdepartment findByDeptId(int depId);
	
	//更新部门信息
	public Crmdepartment updateDept(Crmdepartment crmDepartment);
>>>>>>> 795f20e72cac21aa9ffa1b102163771bd621ac0b
}
