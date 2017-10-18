package com.ibm.crm.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Crmstudent entity. @author MyEclipse Persistence Tools
 */

public class Crmstudent implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private Crmclass crmclass;
	private Crmrefer crmrefer;
	private String studentName;
	private String telephone;
	private String identity;
	private String qq;
	private String gender;
	private Integer mustTuition;
	private Integer actualTuition;
	private String email;
	private String school;
	private String education;
	private String professional;
	private String identityAddress;
	private String address;
	private String remark;
	private String homeTelephone;
	private String homeContact;
	private String studentStatus;
	private Set crmgraduates = new HashSet(0);
	private Set crmstations = new HashSet(0);
	private Set crmrunoffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Crmstudent() {
	}

	/** full constructor */
	public Crmstudent(Crmclass crmclass, Crmrefer crmrefer, String studentName, String telephone, String identity,
			String qq, String gender, Integer mustTuition, Integer actualTuition, String email, String school,
			String education, String professional, String identityAddress, String address, String remark,
			String homeTelephone, String homeContact, String studentStatus, Set crmgraduates, Set crmstations,
			Set crmrunoffs) {
		this.crmclass = crmclass;
		this.crmrefer = crmrefer;
		this.studentName = studentName;
		this.telephone = telephone;
		this.identity = identity;
		this.qq = qq;
		this.gender = gender;
		this.mustTuition = mustTuition;
		this.actualTuition = actualTuition;
		this.email = email;
		this.school = school;
		this.education = education;
		this.professional = professional;
		this.identityAddress = identityAddress;
		this.address = address;
		this.remark = remark;
		this.homeTelephone = homeTelephone;
		this.homeContact = homeContact;
		this.studentStatus = studentStatus;
		this.crmgraduates = crmgraduates;
		this.crmstations = crmstations;
		this.crmrunoffs = crmrunoffs;
	}

	// Property accessors

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Crmclass getCrmclass() {
		return this.crmclass;
	}

	public void setCrmclass(Crmclass crmclass) {
		this.crmclass = crmclass;
	}

	public Crmrefer getCrmrefer() {
		return this.crmrefer;
	}

	public void setCrmrefer(Crmrefer crmrefer) {
		this.crmrefer = crmrefer;
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

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getMustTuition() {
		return this.mustTuition;
	}

	public void setMustTuition(Integer mustTuition) {
		this.mustTuition = mustTuition;
	}

	public Integer getActualTuition() {
		return this.actualTuition;
	}

	public void setActualTuition(Integer actualTuition) {
		this.actualTuition = actualTuition;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfessional() {
		return this.professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getIdentityAddress() {
		return this.identityAddress;
	}

	public void setIdentityAddress(String identityAddress) {
		this.identityAddress = identityAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHomeTelephone() {
		return this.homeTelephone;
	}

	public void setHomeTelephone(String homeTelephone) {
		this.homeTelephone = homeTelephone;
	}

	public String getHomeContact() {
		return this.homeContact;
	}

	public void setHomeContact(String homeContact) {
		this.homeContact = homeContact;
	}

	public String getStudentStatus() {
		return this.studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public Set getCrmgraduates() {
		return this.crmgraduates;
	}

	public void setCrmgraduates(Set crmgraduates) {
		this.crmgraduates = crmgraduates;
	}

	public Set getCrmstations() {
		return this.crmstations;
	}

	public void setCrmstations(Set crmstations) {
		this.crmstations = crmstations;
	}

	public Set getCrmrunoffs() {
		return this.crmrunoffs;
	}

	public void setCrmrunoffs(Set crmrunoffs) {
		this.crmrunoffs = crmrunoffs;
	}

}