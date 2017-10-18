package com.ibm.crm.hr.dao;

import java.util.Map;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstaff;

public class StaffDao extends GenericHibernateDao<Crmstaff, Integer> implements IStaffDao {

	
	@Override
	public Crmstaff add(Crmstaff crmStaff) {
		// TODO Auto-generated method stub
		return super.create(crmStaff);
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
		/*if(map != null && map.size() > 0){
			List<Object> list = new ArrayList<Object>();
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				String key = iter.next();
				if("depName".equals(key)){
					hql += "or s.studentName like ?";
					list.add("%"+map.get(key)+"%");
				}
				if("postName".equals(key)){
					hql += "or s.telephone like ?";
					list.add("%"+map.get(key)+"%");
				}
				if("staffName".equals(key)){
					hql += "or s.qq like ?";
					list.add("%"+map.get(key)+"%");
				}
			}
			params = list.toArray();
		}*/
		pb = super.findByPage(hql, pageCode, pageSize, params);

		return pb;
	}

}
