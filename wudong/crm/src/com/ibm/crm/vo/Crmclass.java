package com.ibm.crm.vo;

/**
 * Crmclass entity. @author MyEclipse Persistence Tools
 */

public class Crmclass implements java.io.Serializable {

	// Fields

	private Integer classId;
	private Crmcoursetype crmcoursetype;
	private String className;
	private String beginTime;
	private String endTime;
	private String status;
	private Integer totalCount;
	private Integer upgradeCount;
	private Integer changeCount;
	private Integer runoffCount;
	private String remark;
	private String uploadPath;
	private String uploadFileName;
	private String uploadTime;

	// Constructors

	/** default constructor */
	public Crmclass() {
	}

	/** full constructor */
	public Crmclass(Crmcoursetype crmcoursetype, String className, String beginTime, String endTime, String status,
			Integer totalCount, Integer upgradeCount, Integer changeCount, Integer runoffCount, String remark,
			String uploadPath, String uploadFileName, String uploadTime) {
		this.crmcoursetype = crmcoursetype;
		this.className = className;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.status = status;
		this.totalCount = totalCount;
		this.upgradeCount = upgradeCount;
		this.changeCount = changeCount;
		this.runoffCount = runoffCount;
		this.remark = remark;
		this.uploadPath = uploadPath;
		this.uploadFileName = uploadFileName;
		this.uploadTime = uploadTime;
	}

	// Property accessors

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Crmcoursetype getCrmcoursetype() {
		return this.crmcoursetype;
	}

	public void setCrmcoursetype(Crmcoursetype crmcoursetype) {
		this.crmcoursetype = crmcoursetype;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getUpgradeCount() {
		return this.upgradeCount;
	}

	public void setUpgradeCount(Integer upgradeCount) {
		this.upgradeCount = upgradeCount;
	}

	public Integer getChangeCount() {
		return this.changeCount;
	}

	public void setChangeCount(Integer changeCount) {
		this.changeCount = changeCount;
	}

	public Integer getRunoffCount() {
		return this.runoffCount;
	}

	public void setRunoffCount(Integer runoffCount) {
		this.runoffCount = runoffCount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUploadPath() {
		return this.uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public String getUploadFileName() {
		return this.uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

}