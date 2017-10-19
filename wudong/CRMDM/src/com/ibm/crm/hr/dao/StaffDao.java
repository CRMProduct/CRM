package com.ibm.crm.hr.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstaff;

public class StaffDao extends GenericHibernateDao<Crmstaff, Integer> implements IStaffDao {

	
	@Override
	public boolean add(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(super.create(crmStaff) != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateStaff(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(super.update(crmStaff) != null){
			flag = true;
		}
		return flag;
	}

	@Override
	public Crmstaff findStaffById(int staffId) {
		// TODO Auto-generated method stub
		return super.findById(staffId);
	}
	
	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		PageBean pb = null;
		String hql = "select s from Crmstaff as s where 1=1";
		Object params[] = new Object[]{};
		if(map != null && map.size() > 0){
			hql = "select s from Crmstaff as s,Crmpost as p,Crmdepartment as d where 1=1 and s.crmpost=p and p.crmdepartment=d ";
			List<Object> list = new ArrayList<Object>();
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				String key = iter.next();
				if("depName".equals(key)){
					hql += "and d.depName like ?";
					list.add("%"+map.get(key)+"%");
				}
				if("postName".equals(key)){
					hql += "and p.postName like ?";
					list.add("%"+map.get(key)+"%");
				}
				if("staffName".equals(key)){
					hql += "and s.staffName like ?";
					list.add("%"+map.get(key)+"%");
				}
			}
			params = list.toArray();
		}
		pb = super.findByPage(hql, pageCode, pageSize, params);

		return pb;
	}

	@Override
	public Crmstaff login(String loginName, String loginPwd) {
		Crmstaff crmstaff = null;
		List<Criterion> criterions = new ArrayList<Criterion>();
		criterions.add(Restrictions.eq("loginName", loginName));
		criterions.add(Restrictions.eq("loginPwd", loginPwd));
		List<Crmstaff> cs = super.findByCriteria(criterions);
		if (cs.size() > 0) {
			crmstaff = cs.get(0);
		}
		return crmstaff;

	}
}
