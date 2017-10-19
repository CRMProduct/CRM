package com.ibm.crm.cond.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmrefer;

public class ReferDao extends GenericHibernateDao<Crmrefer,Integer> implements IReferDao {
//分页
	@Override
	public PageBean findByPage(int pageCode, int pageSize,Map map) {
		PageBean pb = null;
		String hql = "select r from Crmrefer as r where 1=1 ";
		Object params[] = new Object[]{};
		if(map != null && map.size() > 0){
			List<Object> list = new ArrayList<Object>();
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()){
				String key = iter.next();
				if("condition".equals(key)){
					hql += "and r.studentName+r.telephone+r.qq like ?)";
					list.add("%"+map.get(key)+"%");
				}
			}
			params = list.toArray();
		}
		pb = super.findByPage(hql, pageCode, pageSize, params);

		return pb;
	}
//根据ID查找
	@Override
	public Crmrefer queryById(int referId) {
		Crmrefer crmrefer = super.findById(referId);
		return  crmrefer;
	}
//更新咨询表中的信息
	@Override
	public boolean updateRefer(Crmrefer crmrefer) {
		boolean flag = false;
		Crmrefer updateRefer = super.update(crmrefer);
		if(updateRefer!=null){
			flag = true;
		}
		return flag ;
	}

	
	
}
