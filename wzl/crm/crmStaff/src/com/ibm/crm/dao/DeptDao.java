package com.ibm.crm.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmdepartment;

public class DeptDao extends GenericHibernateDao<Crmdepartment, Integer> implements IDeptDao {

	//分页
	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		PageBean pb = null;
		String hql = "select d from Crmdepartment as d where 1=1";
		Object params[] = new Object[]{};
		if(map != null && map.size() > 0){
			List<Object> list = new ArrayList<Object>();
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				String key = iter.next();
				if("depName".equals(key)){
					hql += "and d.depName like ?";
					list.add("%"+map.get(key)+"%");
				}
			}
			params = list.toArray();
		}
		pb = super.findByPage(hql, pageCode, pageSize, params);

		return pb;
	}

	//添加部门
	@Override
	public boolean addDepartment(Crmdepartment department) {
		boolean flag = false;
		Crmdepartment addDepartment = super.create(department);
		if(addDepartment!=null){
			flag=true;
		}
		return flag;
	}

	//根据ID查询
	@Override
	public Crmdepartment findById(int depId) {
		// TODO Auto-generated method stub
		return super.findById(depId);
	}

	//更新部门信息
	@Override
	public Crmdepartment updateDept(Crmdepartment crmdepartment) {
		// TODO Auto-generated method stub
		return super.update(crmdepartment);
	}

	//查询所有部门
	@Override
	public ArrayList<Crmdepartment> findAllDept() {
		// TODO Auto-generated method stub
		return (ArrayList<Crmdepartment>) super.findAll();
	}

}
