package com.ibm.crm.td.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmcoursetype;

public class CourseDao extends GenericHibernateDao<Crmcoursetype, Integer> implements ICouesrDao {

	@Override
	public boolean addCourse(Crmcoursetype crmcoursetype) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmcoursetype newCrmcoursetype = super.create(crmcoursetype);
		if (newCrmcoursetype != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		PageBean pb = null;
		String hql = "select c from Crmcoursetype as c where 1=1 ";
		Object params[] = new Object[]{};
		if(map != null && map.size() > 0){
			List<Object> list = new ArrayList<Object>();
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				String key = iter.next();
				if("courseName".equals(key)){
					hql += "and c.courseName like ?";
					list.add("%"+map.get(key)+"%");
				}
				if("remark".equals(key)){
					hql += "and c.remark like ?";
					list.add("%"+map.get(key)+"%");
				}
				if("total1".equals(key)){
					hql += "and c.total between ? ";
					list.add("%"+map.get(key)+"%");
				}
				if("total2".equals(key)){
					hql += "and ?";
					list.add("%"+map.get(key)+"%");
				}
				if("courseCost1".equals(key)){
					hql += "and c.courseCost between ? ";
					list.add("%"+map.get(key)+"%");
				}
				if("courseCost2".equals(key)){
					hql += "and ? ";
					list.add("%"+map.get(key)+"%");
				}
			}
			params = list.toArray();
		}
		pb = super.findByPage(hql, pageCode, pageSize, params);
		return pb;
	}

	@Override
	public Crmcoursetype findById(int courseTypeId) {
		// TODO Auto-generated method stub
		Crmcoursetype crmcoursetype = super.findById(courseTypeId);
		return crmcoursetype;
	}

	@Override
	public boolean updateCourse(Crmcoursetype crmcoursetype) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmcoursetype updateCourse = super.update(crmcoursetype);
		if (updateCourse != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<Crmcoursetype> findAllCourse() {
		return super.findAll();
	}

}
