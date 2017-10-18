package com.ibm.crm.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Crmrefer entity. @author MyEclipse Persistence Tools
 */

public class Crmrefer implements java.io.Serializable {

	// Fields

	private Integer referId;
	private String studentName;
	private String telephone;
	private String qq;
	private String createDate;
	private String intentionLevel;
	private Integer courseTypeId;
	private Integer classId;
	private String source;
	private String studentStatus;
	private String remark;
	private Integer staffId;
	private Set crmstudents = new HashSet(0);
	private Set crmfollows = new HashSet(0);

	// Constructors

	/** default constructor */
	public Crmrefer() {
	}

	/** full constructor */
	public Crmrefer(String studentName, String telephone, String qq, String createDate, String intentionLevel,
			Integer courseTypeId, Integer classId, String source, String studentStatus, String remark, Integer staffId,
			Set crmstudents, Set crmfollows) {
		this.studentName = studentName;
		this.telephone = telephone;
		this.qq = qq;
		this.createDate = createDate;
		this.intentionLevel = intentionLevel;
		this.courseTypeId = courseTypeId;
		this.classId = classId;
		this.source = source;
		this.studentStatus = studentStatus;
		this.remark = remark;
		this.staffId = staffId;
		this.crmstudents = crmstudents;
		this.crmfollows = crmfollows;
	}

	// Property accessors

	public Integer getReferId() {
		return this.referId;
	}

	public void setReferId(Integer referId) {
		this.referId = referId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getIntentionLevel() {
		return this.intentionLevel;
	}

	public void setIntentionLevel(String intentionLevel) {
		this.intentionLevel = intentionLevel;
	}

	public Integer getCourseTypeId() {
		return this.courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStudentStatus() {
		return this.studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Set getCrmstudents() {
		return this.crmstudents;
	}

	public void setCrmstudents(Set crmstudents) {
		this.crmstudents = crmstudents;
	}

	public Set getCrmfollows() {
		return this.crmfollows;
	}

	public void setCrmfollows(Set crmfollows) {
		this.crmfollows = crmfollows;
	}

}