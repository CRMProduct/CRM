package com.ibm.crm.pojo;

/**
 * Crmfollow entity. @author MyEclipse Persistence Tools
 */

public class Crmfollow implements java.io.Serializable {

	// Fields

	private Integer followId;
	private Crmrefer crmrefer;
	private String followTime;
	private String content;
	private Integer staffId;

	// Constructors

	/** default constructor */
	public Crmfollow() {
	}

	/** full constructor */
	public Crmfollow(Crmrefer crmrefer, String followTime, String content, Integer staffId) {
		this.crmrefer = crmrefer;
		this.followTime = followTime;
		this.content = content;
		this.staffId = staffId;
	}

	// Property accessors

	public Integer getFollowId() {
		return this.followId;
	}

	public void setFollowId(Integer followId) {
		this.followId = followId;
	}

	public Crmrefer getCrmrefer() {
		return this.crmrefer;
	}

	public void setCrmrefer(Crmrefer crmrefer) {
		this.crmrefer = crmrefer;
	}

	public String getFollowTime() {
		return this.followTime;
	}

	public void setFollowTime(String followTime) {
		this.followTime = followTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

}