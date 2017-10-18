package com.ibm.crm.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Crmcoursetype entity. @author MyEclipse Persistence Tools
 */

public class Crmcoursetype implements java.io.Serializable {

	// Fields

	private Integer courseTypeId;
	private Double courseCost;
	private Integer total;
	private String courseName;
	private String remark;
	private Set crmclasses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Crmcoursetype() {
	}

	/** full constructor */
	public Crmcoursetype(Double courseCost, Integer total, String courseName, String remark, Set crmclasses) {
		this.courseCost = courseCost;
		this.total = total;
		this.courseName = courseName;
		this.remark = remark;
		this.crmclasses = crmclasses;
	}

	// Property accessors

	public Integer getCourseTypeId() {
		return this.courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public Double getCourseCost() {
		return this.courseCost;
	}

	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getCrmclasses() {
		return this.crmclasses;
	}

	public void setCrmclasses(Set crmclasses) {
		this.crmclasses = crmclasses;
	}

}