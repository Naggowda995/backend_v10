package org.littuss.hrManagementApp.internRegisterModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class InternNormalizedData {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long internId;
  
   // other common fields for a person
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternFullName internFullname;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternJioningInfo internJioninfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternChecklistJoining internCheccklistJion;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternPersonalInfo internPersonalInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternAddressInfo internAddrInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternDependentInfo internDependentInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternEmergencyContact internContInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternEducationDetais internEducationDetais;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternBankDetails internBankDetails;
  
  @OneToOne(cascade = CascadeType.ALL)
  private InternAcknowledgement internAcknowledgement;
  
  private String activeStatus="1";
  
  

  //NoArgConstructor
  public InternNormalizedData() {  }

  //ConstructorWithFields
  public InternNormalizedData(InternFullName internFullname, InternJioningInfo internJioninfo,
		  InternChecklistJoining internCheccklistJion, InternPersonalInfo internPersonalInfo,
		InternAddressInfo internAddrInfo, InternDependentInfo internDependentInfo,
		InternEmergencyContact internContInfo, InternEducationDetais internEducationDetais,
		InternBankDetails internBankDetails, InternAcknowledgement internAcknowledgement, String activeStatus) {
	
	this.internFullname = internFullname;
	this.internJioninfo = internJioninfo;
	this.internCheccklistJion = internCheccklistJion;
	this.internPersonalInfo = internPersonalInfo;
	this.internAddrInfo = internAddrInfo;
	this.internDependentInfo = internDependentInfo;
	this.internContInfo = internContInfo;
	this.internEducationDetais = internEducationDetais;
	this.internBankDetails = internBankDetails;
	this.internAcknowledgement = internAcknowledgement;
	this.activeStatus = activeStatus;
  }

  //Getters
  public String getActiveStatus() {
	  return activeStatus;
  }
  
public Long getInternId() {
	return internId;
}

public InternFullName getInternFullname() {
	return internFullname;
}

public InternJioningInfo getInternJioninfo() {
	return internJioninfo;
}

public InternChecklistJoining getInternCheccklistJoin() {
	return internCheccklistJion;
}

public InternPersonalInfo getInternPersonalInfo() {
	return internPersonalInfo;
}

public InternAddressInfo getInternAddrInfo() {
	return internAddrInfo;
}

public InternDependentInfo getInternDependentInfo() {
	return internDependentInfo;
}

public InternEmergencyContact getInternContInfo() {
	return internContInfo;
}

public InternEducationDetais getInternEducationDetais() {
	return internEducationDetais;
}

public InternBankDetails getInternBankDetails() {
	return internBankDetails;
}

public InternAcknowledgement getInternAcknowledgement() {
	return internAcknowledgement;
}


//Setters
public void setActiveStatus(String activeStatus) {
	this.activeStatus=activeStatus;
}

public void setInternFullname(InternFullName internFullname) {
	this.internFullname = internFullname;
}

public void setInternJioninfo(InternJioningInfo internJioninfo) {
	this.internJioninfo = internJioninfo;
}

public void setInternCheccklistJoin(InternChecklistJoining internCheccklistJion) {
	this.internCheccklistJion = internCheccklistJion;
}

public void setInternPersonalInfo(InternPersonalInfo internPersonalInfo) {
	this.internPersonalInfo = internPersonalInfo;
}

public void setInternAddrInfo(InternAddressInfo internAddrInfo) {
	this.internAddrInfo = internAddrInfo;
}

public void setInternDependentInfo(InternDependentInfo internDependentInfo) {
	this.internDependentInfo = internDependentInfo;
}

public void setInternContInfo(InternEmergencyContact internContInfo) {
	this.internContInfo = internContInfo;
}

public void setInternEducationDetais(InternEducationDetais internEducationDetais) {
	this.internEducationDetais = internEducationDetais;
}

public void setInternBankDetails(InternBankDetails internBankDetails) {
	this.internBankDetails = internBankDetails;
}

public void setInternAcknowledgement(InternAcknowledgement internAcknowledgement) {
	this.internAcknowledgement = internAcknowledgement;
}

  
  }
