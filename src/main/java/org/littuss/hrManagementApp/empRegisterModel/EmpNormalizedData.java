package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class EmpNormalizedData {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long employeeId;
  
   // other common fields for a person
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpFullName empFullname;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpJioningInfo empJioninfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpChecklistJoining empCheccklistJion;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpPersonalInfo empPersonalInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpAddressInfo empAddrInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpDependentInfo empDependentInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpEmergencyContact empEmgContInfo;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpEducationDetais empEducationDetais;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpExperience empExperience;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpNominee empEmployeeNominee;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpBankDetails empBankDetails;
  
  @OneToOne(cascade = CascadeType.ALL)
  private EmpAcknowledgement empAcknowledgement;
  
  private String activeStatus="1";

  //NoArgConstructor
  public EmpNormalizedData() {  }

  //ConstructorWithFields
  	public EmpNormalizedData(EmpFullName empFullname, EmpJioningInfo empJioninfo,
  			EmpChecklistJoining empCheccklistJion, EmpPersonalInfo empPersonalInfo, EmpAddressInfo empAddrInfo,
		EmpDependentInfo empDependentInfo, EmpEmergencyContact empEmgContInfo, EmpEducationDetais empEducationDetais,
		EmpExperience empExperience, EmpNominee empEmployeeNominee, EmpBankDetails empBankDetails,
		EmpAcknowledgement empAcknowledgement, String activeStatus) {
	
	this.empFullname = empFullname;
	this.empJioninfo = empJioninfo;
	this.empCheccklistJion = empCheccklistJion;
	this.empPersonalInfo = empPersonalInfo;
	this.empAddrInfo = empAddrInfo;
	this.empDependentInfo = empDependentInfo;
	this.empEmgContInfo = empEmgContInfo;
	this.empEducationDetais = empEducationDetais;
	this.empExperience = empExperience;
	this.empEmployeeNominee = empEmployeeNominee;
	this.empBankDetails = empBankDetails;
	this.empAcknowledgement = empAcknowledgement;
	this.activeStatus = activeStatus;
	}

  	//Getters
  	public String getActiveStatus() {
  		return activeStatus;
  	}
	public Long getEmployeeId() {
		return employeeId;
	}

	public EmpFullName getEmpFullname() {
		return empFullname;
	}

	public EmpJioningInfo getEmpJioninfo() {
		return empJioninfo;
	}

	public EmpChecklistJoining getEmpCheccklistJoin() {
		return empCheccklistJion;
	}

	public EmpPersonalInfo getEmpPersonalInfo() {
		return empPersonalInfo;
	}

	public EmpAddressInfo getEmpAddrInfo() {
		return empAddrInfo;
	}

	public EmpDependentInfo getEmpDependentInfo() {
		return empDependentInfo;
	}

	public EmpEmergencyContact getEmpEmgContInfo() {
		return empEmgContInfo;
	}

	public EmpEducationDetais getEmpEducationDetais() {
		return empEducationDetais;
	}

	public EmpExperience getEmpExperience() {
		return empExperience;
	}

	public EmpNominee getEmpEmployeeNominee() {
		return empEmployeeNominee;
	}

	public EmpBankDetails getEmpBankDetails() {
		return empBankDetails;
	}

	public EmpAcknowledgement getEmpAcknowledgement() {
		return empAcknowledgement;
	}

	//Setters

	public void setActiveStatus (String activeStatus) {
		this.activeStatus=activeStatus;
	}
	public void setEmpFullname(EmpFullName empFullname) {
		this.empFullname = empFullname;
	}

	public void setEmpJioninfo(EmpJioningInfo empJioninfo) {
		this.empJioninfo = empJioninfo;
	}

	public void setEmpCheccklistJoin(EmpChecklistJoining empCheccklistJion) {
		this.empCheccklistJion = empCheccklistJion;
	}

	public void setEmpPersonalInfo(EmpPersonalInfo empPersonalInfo) {
		this.empPersonalInfo = empPersonalInfo;
	}

	public void setEmpAddrInfo(EmpAddressInfo empAddrInfo) {
		this.empAddrInfo = empAddrInfo;
	}

	public void setEmpDependentInfo(EmpDependentInfo empDependentInfo) {
		this.empDependentInfo = empDependentInfo;
	}

	public void setEmpEmgContInfo(EmpEmergencyContact empEmgContInfo) {
		this.empEmgContInfo = empEmgContInfo;
	}

	public void setEmpEducationDetais(EmpEducationDetais empEducationDetais) {
		this.empEducationDetais = empEducationDetais;
	}

	public void setEmpExperience(EmpExperience empExperience) {
		this.empExperience = empExperience;
	}

	public void setEmpEmployeeNominee(EmpNominee empEmployeeNominee) {
		this.empEmployeeNominee = empEmployeeNominee;
	}

	public void setEmpBankDetails(EmpBankDetails empBankDetails) {
		this.empBankDetails = empBankDetails;
	}

	public void setEmpAcknowledgement(EmpAcknowledgement empAcknowledgement) {
		this.empAcknowledgement = empAcknowledgement;
	}
  
  	
  
}
