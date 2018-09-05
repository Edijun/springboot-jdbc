package com.junkodesain.model;

import java.sql.Timestamp;
import java.util.Date;

public class Customer {
	private Long id;
	private String custId;
	private String salutation;
	private String fullName;
	private String motherName;
	private String birthPlace;
	private Date birthDate;
	private String gender;
	private String religion;
	private String martialStatus;
	private Integer numberDependent;
	private String occupation;
	private String subOccupation;
	private Timestamp createdAt;
	private Long createdBy;
	private Timestamp updateAt;
	private Long updateBy;

	public Customer(Long id, String custId, String salutation, String fullName, String motherName, String birthPlace,
			Date birthDate, String gender, String religion, String martialStatus, Integer numberDependent,
			String occupation, String subOccupation, Timestamp createdAt, Long createdBy, Timestamp updateAt,
			Long updateBy) {
		super();
		this.id = id;
		this.custId = custId;
		this.salutation = salutation;
		this.fullName = fullName;
		this.motherName = motherName;
		this.birthPlace = birthPlace;
		this.birthDate = birthDate;
		this.gender = gender;
		this.religion = religion;
		this.martialStatus = martialStatus;
		this.numberDependent = numberDependent;
		this.occupation = occupation;
		this.subOccupation = subOccupation;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updateAt = updateAt;
		this.updateBy = updateBy;
	}

	public Customer() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public Integer getNumberDependent() {
		return numberDependent;
	}

	public void setNumberDependent(Integer numberDependent) {
		this.numberDependent = numberDependent;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSubOccupation() {
		return subOccupation;
	}

	public void setSubOccupation(String subOccupation) {
		this.subOccupation = subOccupation;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custId=" + custId + ", salutation=" + salutation + ", fullName=" + fullName
				+ ", motherName=" + motherName + ", birthPlace=" + birthPlace + ", birthDate=" + birthDate + ", gender="
				+ gender + ", religion=" + religion + ", martialStatus=" + martialStatus + ", numberDependent="
				+ numberDependent + ", occupation=" + occupation + ", subOccupation=" + subOccupation + ", createdAt="
				+ createdAt + ", createdBy=" + createdBy + ", updateAt=" + updateAt + ", updateBy=" + updateBy + "]";
	}

}
