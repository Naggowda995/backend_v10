package org.littuss.hrManagementApp.itRecruitmentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "ItRecruitmentClientSideDetails")

//Mobile Num CL
//Email ID CL

public class ItRecruitmentClientSideDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long recruitmentid;
	private String clientMobileNumber;
	private String clientEmailId;
	public ItRecruitmentClientSideDetailsEntity() {
		
	}
	public ItRecruitmentClientSideDetailsEntity(Long recruitmentid, String clientMobileNumber, String clientEmailId) {
		super();
		this.recruitmentid = recruitmentid;
		this.clientMobileNumber = clientMobileNumber;
		this.clientEmailId = clientEmailId;
	}
	public Long getRecruitmentid() {
		return recruitmentid;
	}
	public void setRecruitmentid(Long recruitmentid) {
		this.recruitmentid = recruitmentid;
	}
	public String getClientMobileNumber() {
		return clientMobileNumber;
	}
	public void setClientMobileNumber(String clientMobileNumber) {
		this.clientMobileNumber = clientMobileNumber;
	}
	public String getClientEmailId() {
		return clientEmailId;
	}
	public void setClientEmailId(String clientEmailId) {
		this.clientEmailId = clientEmailId;
	}
	@Override
	public String toString() {
		return "ItRecruitmentClientSideDetailsEntity [recruitmentid=" + recruitmentid + ", clientMobileNumber="
				+ clientMobileNumber + ", clientEmailId=" + clientEmailId + "]";
	}
	
	
	
	
	}
