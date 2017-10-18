package com.ibm.crm.pojo;

/**
 * Crmstation entity. @author MyEclipse Persistence Tools
 */

public class Crmstation implements java.io.Serializable {

	// Fields

	private Integer stationId;
	private Crmstudent crmstudent;
	private String flag;
	private Integer staffId;
	private String createDate;
	private Integer beforeClassId;
	private Integer afterClassId;

	// Constructors

	/** default constructor */
	public Crmstation() {
	}

	/** full constructor */
	public Crmstation(Crmstudent crmstudent, String flag, Integer staffId, String createDate, Integer beforeClassId,
			Integer afterClassId) {
		this.crmstudent = crmstudent;
		this.flag = flag;
		this.staffId = staffId;
		this.createDate = createDate;
		this.beforeClassId = beforeClassId;
		this.afterClassId = afterClassId;
	}

	// Property accessors

	public Integer getStationId() {
		return this.stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public Crmstudent getCrmstudent() {
		return this.crmstudent;
	}

	public void setCrmstudent(Crmstudent crmstudent) {
		this.crmstudent = crmstudent;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public Integer getBeforeClassId() {
		return this.beforeClassId;
	}

	public void setBeforeClassId(Integer beforeClassId) {
		this.beforeClassId = beforeClassId;
	}

	public Integer getAfterClassId() {
		return this.afterClassId;
	}

	public void setAfterClassId(Integer afterClassId) {
		this.afterClassId = afterClassId;
	}

}