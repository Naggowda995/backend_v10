package org.littuss.hrManagementApp.itRecruitmentModel;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "ItRecruitmentScreeningDetails")

//Technology
//C.T.C LPA
//Exp
//Expected CTC
//Current Location
//Job Type

public class ItRecruitmentScreeningDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long recruitmentid;
	private String technology;
	private String ctcLpa;
	private String experience;
	private String expectedCtc;
	private String currentLocation;
	private String jobType;
	public ItRecruitmentScreeningDetailsEntity() {
		
	}
	public ItRecruitmentScreeningDetailsEntity(Long recruitmentid, String technology, String ctcLpa, String experience,
			String expectedCtc, String currentLocation, String jobType) {
		super();
		this.recruitmentid = recruitmentid;
		this.technology = technology;
		this.ctcLpa = ctcLpa;
		this.experience = experience;
		this.expectedCtc = expectedCtc;
		this.currentLocation = currentLocation;
		this.jobType = jobType;
	}
	public Long getRecruitmentid() {
		return recruitmentid;
	}
	public void setRecruitmentid(Long recruitmentid) {
		this.recruitmentid = recruitmentid;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getCtcLpa() {
		return ctcLpa;
	}
	public void setCtcLpa(String ctcLpa) {
		this.ctcLpa = ctcLpa;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getExpectedCtc() {
		return expectedCtc;
	}
	public void setExpectedCtc(String expectedCtc) {
		this.expectedCtc = expectedCtc;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	@Override
	public String toString() {
		return "ItRecruitmentScreeningDetailsEntity [recruitmentid=" + recruitmentid + ", technology=" + technology
				+ ", ctcLpa=" + ctcLpa + ", experience=" + experience + ", expectedCtc=" + expectedCtc
				+ ", currentLocation=" + currentLocation + ", jobType=" + jobType + "]";
	}
	
}
