package com.ibm.crm.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.vo.Crmstaff;

public class StaffDao extends GenericHibernateDao<Crmstaff, Integer> implements IStaffDao {

	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		PageBean pb = null;
		String hql = "select s from Crmstaff as s where 1=1";
		Object params[] = new Object[]{};
		if(map != null && map.size() > 0){
			hql = "select s from Crmdepartment as d,Crmpost as p,Crmstaff as s where s.crmpost=p and p.crmdepartment=d ";
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


}
