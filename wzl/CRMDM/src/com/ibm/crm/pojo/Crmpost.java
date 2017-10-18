package com.ibm.crm.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Crmpost entity. @author MyEclipse Persistence Tools
 */

public class Crmpost implements java.io.Serializable {

	// Fields

	private Integer postId;
	private Crmdepartment crmdepartment;
	private String postName;
	private Set crmstaffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Crmpost() {
	}

	/** full constructor */
	public Crmpost(Crmdepartment crmdepartment, String postName, Set crmstaffs) {
		this.crmdepartment = crmdepartment;
		this.postName = postName;
		this.crmstaffs = crmstaffs;
	}

	// Property accessors

	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Crmdepartment getCrmdepartment() {
		return this.crmdepartment;
	}

	public void setCrmdepartment(Crmdepartment crmdepartment) {
		this.crmdepartment = crmdepartment;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Set getCrmstaffs() {
		return this.crmstaffs;
	}

	public void setCrmstaffs(Set crmstaffs) {
		this.crmstaffs = crmstaffs;
	}

}