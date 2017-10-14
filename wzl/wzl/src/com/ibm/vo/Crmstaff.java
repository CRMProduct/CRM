package com.ibm.vo;

/**
 * Crmstaff entity. @author MyEclipse Persistence Tools
 */

public class Crmstaff implements java.io.Serializable {

	// Fields

	private Integer staffId;
	private Crmpost crmpost;
	private String loginName;
	private String loginPwd;
	private String staffName;
	private String gender;
	private String onDutyDate;

	// Constructors

	/** default constructor */
	public Crmstaff() {
	}

	/** full constructor */
	public Crmstaff(Crmpost crmpost, String loginName, String loginPwd, String staffName, String gender,
			String onDutyDate) {
		this.crmpost = crmpost;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.staffName = staffName;
		this.gender = gender;
		this.onDutyDate = onDutyDate;
	}

	// Property accessors

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Crmpost getCrmpost() {
		return this.crmpost;
	}

	public void setCrmpost(Crmpost crmpost) {
		this.crmpost = crmpost;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getStaffName() {
		return this.staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOnDutyDate() {
		return this.onDutyDate;
	}

	public void setOnDutyDate(String onDutyDate) {
		this.onDutyDate = onDutyDate;
	}

}