package org.littuss.hrManagementApp.internRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class InternPersonalInfo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	//Personal Info
     private String title;
     private String firstname;
     private String middlename;
     private String lastname;
     private String dob;
     private String gender;
     private String fathersname;
     private String mothersname;
     private String maritalstatus;
     private String spousename;
     private String identitymark;
     private String bloodgroup;
     private String anyotherAllergies;
     private String passportNo;
     private String panNo;
     private String aadharNo;
     private String pfAccountNoUan;
     
     //NoArgConstructor
	 public InternPersonalInfo() {		}

	 //ConstrucorWithFields
	 public InternPersonalInfo(String title, String firstname, String middlename, String lastname, String dob, String gender,
			String fathersname, String mothersname, String maritalstatus, String spousename, String identitymark,
			String bloodgroup, String anyotherAllergies, String passportNo, String panNo, String aadharNo,
			String pfAccountNoUan) {
	
		this.title = title;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.fathersname = fathersname;
		this.mothersname = mothersname;
		this.maritalstatus = maritalstatus;
		this.spousename = spousename;
		this.identitymark = identitymark;
		this.bloodgroup = bloodgroup;
		this.anyotherAllergies = anyotherAllergies;
		this.passportNo = passportNo;
		this.panNo = panNo;
		this.aadharNo = aadharNo;
		this.pfAccountNoUan = pfAccountNoUan;
	}

	 //getters
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public String getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	public String getFathersname() {
		return fathersname;
	}

	public String getMothersname() {
		return mothersname;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public String getSpousename() {
		return spousename;
	}

	public String getIdentitymark() {
		return identitymark;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public String getAnyotherAllergies() {
		return anyotherAllergies;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public String getPfAccountNoUan() {
		return pfAccountNoUan;
	}

	//setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}

	public void setMothersname(String mothersname) {
		this.mothersname = mothersname;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}

	public void setIdentitymark(String identitymark) {
		this.identitymark = identitymark;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public void setAnyotherAllergies(String anyotherAllergies) {
		this.anyotherAllergies = anyotherAllergies;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public void setPfAccountNoUan(String pfAccountNoUan) {
		this.pfAccountNoUan = pfAccountNoUan;
	}
	 
	 
     
     
}

