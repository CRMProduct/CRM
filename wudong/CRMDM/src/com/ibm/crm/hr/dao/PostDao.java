package com.ibm.crm.hr.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.crm.base.Address;
import com.ibm.crm.base.GenericHibernateDao;
import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmpost;

public class PostDao extends GenericHibernateDao<Crmpost, Integer> implements IPostDao {

	//职务分页
	@Override
	public PageBean findByPage(int pageCode, int pageSize, Map map) {
		// TODO Auto-generated method stub
		String hql = "from Crmpost";
		Object params[] = new Object[]{};
		PageBean pb = super.findByPage(hql, pageCode, pageSize, params);
		return pb;
	}

	//更新
	@Override
	public boolean modifyPost(Crmpost crmpost) {
		boolean flag = false;
		Crmpost modifyPost = super.update(crmpost);
		if(modifyPost!=null){
			flag=true;
		}
		return flag;
	}

	//根据Id查询
	@Override
	public Crmpost findById(int postId) {
		Crmpost crmpost=super.findById(postId);
		return crmpost;
	}

	//添加
	@Override
	public boolean addPost(Crmpost crmpost) {
		boolean flag = false;
		Crmpost newCrmPost = super.create(crmpost);
		if(newCrmPost!=null){
			flag = true;
		}
		return flag;
	}
	
	//根据部门id查post信息
		public List<Crmpost> findByDeptId(int depId){
			ArrayList<Address> addrList = new ArrayList<Address>();
			String hql = "select p from Crmpost p,Crmdepartment as d where 1=1 and p.crmdepartment=d and d.depId = " + depId;
			Object[] params = new Object[]{};
			List<Crmpost> list = super.findByHQL(hql, params);
			
			return list;
		}

}
