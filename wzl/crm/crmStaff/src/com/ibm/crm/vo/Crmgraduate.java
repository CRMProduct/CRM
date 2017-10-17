package com.ibm.crm.vo;

/**
 * Crmgraduate entity. @author MyEclipse Persistence Tools
 */

public class Crmgraduate implements java.io.Serializable {

	// Fields

	private Integer granduateId;
	private Crmclass crmclass;
	private Crmstudent crmstudent;
	private String companyName;
	private String salary;
	private String post;
	private String entryTime;
	private String remark;

	// Constructors

	/** default constructor */
	public Crmgraduate() {
	}

	/** full constructor */
	public Crmgraduate(Crmclass crmclass, Crmstudent crmstudent, String companyName, String salary, String post,
			String entryTime, String remark) {
		this.crmclass = crmclass;
		this.crmstudent = crmstudent;
		this.companyName = companyName;
		this.salary = salary;
		this.post = post;
		this.entryTime = entryTime;
		this.remark = remark;
	}

	// Property accessors

	public Integer getGranduateId() {
		return this.granduateId;
	}

	public void setGranduateId(Integer granduateId) {
		this.granduateId = granduateId;
	}

	public Crmclass getCrmclass() {
		return this.crmclass;
	}

	public void setCrmclass(Crmclass crmclass) {
		this.crmclass = crmclass;
	}

	public Crmstudent getCrmstudent() {
		return this.crmstudent;
	}

	public void setCrmstudent(Crmstudent crmstudent) {
		this.crmstudent = crmstudent;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getEntryTime() {
		return this.entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}