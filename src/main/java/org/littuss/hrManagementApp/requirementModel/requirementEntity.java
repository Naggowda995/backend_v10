package org.littuss.hrManagementApp.requirementModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "requirementRegister")

public class requirementEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long requirementid;
	private String fullName;
	private String experience;
	private String clientName;
	private String sector;
	private String technology;
	private String gender;
	private String status;
	private String termsConditions;
	private String activeStatus = "1";
	
	public requirementEntity() {
		
	}

	public requirementEntity(String activeStatus, String fullName, String experience, String clientName, String sector,
			String technology, String gender, String status, String termsConditions) {
		this.activeStatus = activeStatus;
		this.fullName = fullName;
		this.experience = experience;
		this.clientName = clientName;
		this.sector = sector;
		this.technology = technology;
		this.gender = gender;
		this.status = status;
		this.termsConditions = termsConditions;
	}
	
	

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Long getRequirementid() {
		return requirementid;
	}

	public void setRequirementid(Long requirementid) {
		this.requirementid = requirementid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTermsConditions() {
		return termsConditions;
	}

	public void setTermsConditions(String termsConditions) {
		this.termsConditions = termsConditions;
	}

	@Override
	public String toString() {
		return "requirementEntity [requirementid=" + requirementid + ", fullName=" + fullName + ", experience="
				+ experience + ", clientName=" + clientName + ", sector=" + sector + ", technology=" + technology
				+ ", gender=" + gender + ", status=" + status + ", termsConditions=" + termsConditions + "activeStatus="+activeStatus + "]";
	}
	

}
