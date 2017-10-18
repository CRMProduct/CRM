package com.ibm.crm.td.biz;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.crm.base.PageBean;
import com.ibm.crm.pojo.Crmcoursetype;
import com.ibm.crm.td.dao.ICouesrDao;

@Transactional(readOnly = true)
public class CourseBiz implements ICourseBiz {

	ICouesrDao courseDao;

	public void setCourseDao(ICouesrDao courseDao) {
		this.courseDao = courseDao;
	}

	@Transactional(readOnly = false)
	@Override
	public boolean registCourse(Crmcoursetype crmcoursetype) {
		// TODO Auto-generated method stub
		return courseDao.addCourse(crmcoursetype);
	}

	@Override
	public PageBean queryByPage(int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		return courseDao.findByPage(pageCode, pageSize);
	}

	// 根据ID查询课程类别
	@Override
	public Crmcoursetype checkById(int courseTypeId) {
		// TODO Auto-generated method stub
		return courseDao.findById(courseTypeId);
	}

	// 更新课程类别
	@Transactional(readOnly = false)
	@Override
	public boolean modifyCourse(Crmcoursetype crmcoursetype) {
		// TODO Auto-generated method stub
		return courseDao.updateCourse(crmcoursetype);
	}

	@Override
	public List<Crmcoursetype> queryAllCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAllCourse();
	}

}
