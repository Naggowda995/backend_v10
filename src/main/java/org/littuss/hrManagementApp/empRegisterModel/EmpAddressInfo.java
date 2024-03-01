package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpAddressInfo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	// address info 
     private String presentAddress;
     private String permanentAddress;
     private String mobileNo;
     private String personalEmailId;
     
     //NoArgConstructor
	 public EmpAddressInfo() {	}
	 
	 //CoonstructorWithFields
	 public EmpAddressInfo(String presentAddress, String permanentAddress, String mobileNo, String personalEmailId) {
		super();
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		this.mobileNo = mobileNo;
		this.personalEmailId = personalEmailId;
	}

	 //Getters
	public Long getId() {
		return id;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	
    //Setters
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}
	 
	 
	 
     
    
     
}
