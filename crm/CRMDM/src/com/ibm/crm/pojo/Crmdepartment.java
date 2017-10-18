package com.ibm.crm.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Crmdepartment entity. @author MyEclipse Persistence Tools
 */

public class Crmdepartment implements java.io.Serializable {

	// Fields

	private Integer depId;
	private String depName;
	private Set crmposts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Crmdepartment() {
	}

	/** full constructor */
	public Crmdepartment(String depName, Set crmposts) {
		this.depName = depName;
		this.crmposts = crmposts;
	}

	// Property accessors

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set getCrmposts() {
		return this.crmposts;
	}

	public void setCrmposts(Set crmposts) {
		this.crmposts = crmposts;
	}

}