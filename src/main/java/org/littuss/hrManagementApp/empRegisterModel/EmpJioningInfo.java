package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpJioningInfo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
	//JioningInfo
	 private String joiningDate;
     private String ofcLoc;
     private String jobTitle;
     
     //NoArgConstructor
	public EmpJioningInfo() {	}

	//ConstructorWithFields
	public EmpJioningInfo(String joiningDate, String ofcLoc, String jobTitle) {
		this.joiningDate = joiningDate;
		this.ofcLoc = ofcLoc;
		this.jobTitle = jobTitle;
	}

	//getters
	public Long getId() {
		return id;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public String getOfcLoc() {
		return ofcLoc;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	//setters except id
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public void setOfcLoc(String ofcLoc) {
		this.ofcLoc = ofcLoc;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
     
	
}

