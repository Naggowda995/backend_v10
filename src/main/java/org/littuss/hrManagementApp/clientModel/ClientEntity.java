package org.littuss.hrManagementApp.clientModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientRegisterDetails")
public class ClientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String date;
	private String clientName;
	private String webSite;
	private String contactPerson;
	private String contactNo;
	private String emailId;
	private String meetingTime;
	private String whoInvolved;
	private String remark;
	private String activeStatus="1";
	public ClientEntity() {
		
	}
	public ClientEntity( String date, String clientName, String webSite, String contactPerson, String contactNo,
			String emailId, String meetingTime, String whoInvolved, String remark, String activeStatus) {
		
		this.date = date;
		this.clientName = clientName;
		this.webSite = webSite;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.meetingTime = meetingTime;
		this.whoInvolved = whoInvolved;
		this.remark = remark;
		this.activeStatus=activeStatus;
	}
	//getters
	public String getActiveStatus()
	{
		return activeStatus;
	}
	public Long getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public String getClientName() {
		return clientName;
	}
	public String getWebSite() {
		return webSite;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public String getContactNo() {
		return contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public String getWhoInvolved() {
		return whoInvolved;
	}
	public String getRemark() {
		return remark;
	}
	
	//setters
	public void setActiveStatus(String activeStatus) {
		this.activeStatus=activeStatus;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}
	public void setWhoInvolved(String whoInvolved) {
		this.whoInvolved = whoInvolved;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Entityclass [id=" + id + ", date=" + date + ", clientName=" + clientName + ", webSite=" + webSite
				+ ", contactPerson=" + contactPerson + ", contactNo=" + contactNo + ", emailId=" + emailId
				+ ", meetingTime=" + meetingTime + ", whoInvolved=" + whoInvolved + ", remark=" + remark + "activeStatus="+activeStatus+"]";
	}
	

}



