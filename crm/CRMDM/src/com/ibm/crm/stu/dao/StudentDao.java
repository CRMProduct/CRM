package com.ibm.crm.stu.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmstudent;

public class StudentDao extends GenericHibernateDao<Crmstudent, Integer> implements IStudentDao{

	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		PageBean pb = null;
		String hql = "select s from Crmstudent as s where 1=1";
		Object params[] = new Object[]{};
		if(map != null && map.size() > 0){
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
		}
		pb = super.findByPage(hql, pageCode, pageSize, params);

		return pb;
	}

	@Override
	public Crmstudent addStudent(Crmstudent student) {
		// TODO Auto-generated method stub
		Crmstudent addStudent = super.create(student);
		return addStudent;
	}

	@Override
	public Crmstudent findStudent(int studentId) {
		// TODO Auto-generated method stub
		Crmstudent findStudent = super.findById(studentId);
		return findStudent;
	}

	@Override
	public boolean updateStudent(Crmstudent student) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Crmstudent updateStudent = super.update(student);
		if(updateStudent != null){
			flag = true;
		}
		return flag;
	}

}
