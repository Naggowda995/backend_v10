package org.littuss.hrManagementApp.itRecruitmentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "ItRecruitmentInterviewDetails")

//Interviews Scheduled
//L1
//L2
//L3
//HR Round

public class ItRecruitmentInterviewDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long recruitmentid;
	private String interviewScheduled;
	private String l1;
	private String l2;
	private String l3;
	private String hrRound;
	public ItRecruitmentInterviewDetailsEntity() {
		
	}
	public ItRecruitmentInterviewDetailsEntity(Long recruitmentid, String interviewScheduled, String l1, String l2,
			String l3, String hrRound) {
		super();
		this.recruitmentid = recruitmentid;
		this.interviewScheduled = interviewScheduled;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.hrRound = hrRound;
	}
	public Long getRecruitmentid() {
		return recruitmentid;
	}
	public void setRecruitmentid(Long recruitmentid) {
		this.recruitmentid = recruitmentid;
	}
	public String getInterviewScheduled() {
		return interviewScheduled;
	}
	public void setInterviewScheduled(String interviewScheduled) {
		this.interviewScheduled = interviewScheduled;
	}
	public String getL1() {
		return l1;
	}
	public void setL1(String l1) {
		this.l1 = l1;
	}
	public String getL2() {
		return l2;
	}
	public void setL2(String l2) {
		this.l2 = l2;
	}
	public String getL3() {
		return l3;
	}
	public void setL3(String l3) {
		this.l3 = l3;
	}
	public String getHrRound() {
		return hrRound;
	}
	public void setHrRound(String hrRound) {
		this.hrRound = hrRound;
	}
	@Override
	public String toString() {
		return "ItRecruitmentInterviewDetailsEntity [recruitmentid=" + recruitmentid + ", interviewScheduled="
				+ interviewScheduled + ", l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", hrRound=" + hrRound + "]";
	}
	

	}
