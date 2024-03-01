package org.littuss.hrManagementApp.itRecruitmentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "ItRecruitmentCandidateDetails")
public class ItRecruitmentCandidateDetailsEntity {
	
//	Mobile Number
//	Email Id
//	Higher Degree
//	Passedout
//	College Name
//	University
//	P . Location
//	Refered by
//	Source
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long recruitmentid;
	private String name;
	private String mobileNumber;
	private String emailId;
	private String higherDegree;
	private String passoutYear;
	private String collegeName;
	private String university;
	private String presentLocation;
	private String referedBy;
	private String source;
	
	public ItRecruitmentCandidateDetailsEntity() {
		
	}

	public ItRecruitmentCandidateDetailsEntity(Long recruitmentid, String name, String mobileNumber, String emailId,
			String higherDegree, String passoutYear, String collegeName, String university, String presentLocation,
			String referedBy, String source) {
		super();
		this.recruitmentid = recruitmentid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.higherDegree = higherDegree;
		this.passoutYear = passoutYear;
		this.collegeName = collegeName;
		this.university = university;
		this.presentLocation = presentLocation;
		this.referedBy = referedBy;
		this.source = source;
	}

	public Long getRecruitmentid() {
		return recruitmentid;
	}

	public void setRecruitmentid(Long recruitmentid) {
		this.recruitmentid = recruitmentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHigherDegree() {
		return higherDegree;
	}

	public void setHigherDegree(String higherDegree) {
		this.higherDegree = higherDegree;
	}

	public String getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(String passoutYear) {
		this.passoutYear = passoutYear;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPresentLocation() {
		return presentLocation;
	}

	public void setPresentLocation(String presentLocation) {
		this.presentLocation = presentLocation;
	}

	public String getReferedBy() {
		return referedBy;
	}

	public void setReferedBy(String referedBy) {
		this.referedBy = referedBy;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "ItRecruitmentCandidateDetailsEntity [recruitmentid=" + recruitmentid + ", name=" + name
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", higherDegree=" + higherDegree
				+ ", passoutYear=" + passoutYear + ", collegeName=" + collegeName + ", university=" + university
				+ ", presentLocation=" + presentLocation + ", referedBy=" + referedBy + ", source=" + source + "]";
	}
	
	
	
	

}