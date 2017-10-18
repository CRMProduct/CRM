package com.ibm.crm.pojo;

/**
 * Crmrunoff entity. @author MyEclipse Persistence Tools
 */

public class Crmrunoff implements java.io.Serializable {

	// Fields

	private Integer runOffId;
	private Crmstudent crmstudent;
	private Integer staffId;
	private String createDate;
	private String isRefund;
	private String refundAmount;
	private String remark;

	// Constructors

	/** default constructor */
	public Crmrunoff() {
	}

	/** full constructor */
	public Crmrunoff(Crmstudent crmstudent, Integer staffId, String createDate, String isRefund, String refundAmount,
			String remark) {
		this.crmstudent = crmstudent;
		this.staffId = staffId;
		this.createDate = createDate;
		this.isRefund = isRefund;
		this.refundAmount = refundAmount;
		this.remark = remark;
	}

	// Property accessors

	public Integer getRunOffId() {
		return this.runOffId;
	}

	public void setRunOffId(Integer runOffId) {
		this.runOffId = runOffId;
	}

	public Crmstudent getCrmstudent() {
		return this.crmstudent;
	}

	public void setCrmstudent(Crmstudent crmstudent) {
		this.crmstudent = crmstudent;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getIsRefund() {
		return this.isRefund;
	}

	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}