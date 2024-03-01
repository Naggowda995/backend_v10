package org.littuss.hrManagementApp.itRecruitmentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "ItRecruitmentStatus")

//Active
//In Active

public class ItRecruitmentStatusEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long recruitmentid;
	private String active;
	private String inActive;
	public ItRecruitmentStatusEntity() {
		
	}
	public ItRecruitmentStatusEntity(Long recruitmentid, String active, String inActive) {
		super();
		this.recruitmentid = recruitmentid;
		this.active = active;
		this.inActive = inActive;
	}
	public Long getRecruitmentid() {
		return recruitmentid;
	}
	public void setRecruitmentid(Long recruitmentid) {
		this.recruitmentid = recruitmentid;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getInActive() {
		return inActive;
	}
	public void setInActive(String inActive) {
		this.inActive = inActive;
	}
	@Override
	public String toString() {
		return "ItRecruitmentStatusEntity [recruitmentid=" + recruitmentid + ", active=" + active + ", inActive="
				+ inActive + "]";
	}
	
}
