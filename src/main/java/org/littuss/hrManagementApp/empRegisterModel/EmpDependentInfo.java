package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpDependentInfo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	//Dependent Info
     private String dependentName1;
     private String dependentRelationship1;
     private String dependentDateOfBirth1;

     private String dependentName2;
     private String dependentRelationship2;
     private String dependentDateOfBirth2;

     private String dependentName3;
     private String dependentRelationship3;
     private String dependentDateOfBirth3;

     private String dependentName4;
     private String dependentRelationship4;
     private String dependentDateOfBirth4;
     
     //NoArgConstructor
	 public EmpDependentInfo() {	}

	 //ConStructorWithFields
	public EmpDependentInfo(String dependentName1, String dependentRelationship1, String dependentDateOfBirth1,
			String dependentName2, String dependentRelationship2, String dependentDateOfBirth2, String dependentName3,
			String dependentRelationship3, String dependentDateOfBirth3, String dependentName4,
			String dependentRelationship4, String dependentDateOfBirth4) {
		
		this.dependentName1 = dependentName1;
		this.dependentRelationship1 = dependentRelationship1;
		this.dependentDateOfBirth1 = dependentDateOfBirth1;
		this.dependentName2 = dependentName2;
		this.dependentRelationship2 = dependentRelationship2;
		this.dependentDateOfBirth2 = dependentDateOfBirth2;
		this.dependentName3 = dependentName3;
		this.dependentRelationship3 = dependentRelationship3;
		this.dependentDateOfBirth3 = dependentDateOfBirth3;
		this.dependentName4 = dependentName4;
		this.dependentRelationship4 = dependentRelationship4;
		this.dependentDateOfBirth4 = dependentDateOfBirth4;
	}

	//Getters
	public Long getId() {
		return id;
	}

	public String getDependentName1() {
		return dependentName1;
	}

	public String getDependentRelationship1() {
		return dependentRelationship1;
	}

	public String getDependentDateOfBirth1() {
		return dependentDateOfBirth1;
	}

	public String getDependentName2() {
		return dependentName2;
	}

	public String getDependentRelationship2() {
		return dependentRelationship2;
	}

	public String getDependentDateOfBirth2() {
		return dependentDateOfBirth2;
	}

	public String getDependentName3() {
		return dependentName3;
	}

	public String getDependentRelationship3() {
		return dependentRelationship3;
	}

	public String getDependentDateOfBirth3() {
		return dependentDateOfBirth3;
	}

	public String getDependentName4() {
		return dependentName4;
	}

	public String getDependentRelationship4() {
		return dependentRelationship4;
	}

	public String getDependentDateOfBirth4() {
		return dependentDateOfBirth4;
	}

	//Setters
	public void setDependentName1(String dependentName1) {
		this.dependentName1 = dependentName1;
	}

	public void setDependentRelationship1(String dependentRelationship1) {
		this.dependentRelationship1 = dependentRelationship1;
	}

	public void setDependentDateOfBirth1(String dependentDateOfBirth1) {
		this.dependentDateOfBirth1 = dependentDateOfBirth1;
	}

	public void setDependentName2(String dependentName2) {
		this.dependentName2 = dependentName2; 
	}

	public void setDependentRelationship2(String dependentRelationship2) {
		this.dependentRelationship2 = dependentRelationship2;
	}

	public void setDependentDateOfBirth2(String dependentDateOfBirth2) {
		this.dependentDateOfBirth2 = dependentDateOfBirth2;
	}

	public void setDependentName3(String dependentName3) {
		this.dependentName3 = dependentName3;
	}

	public void setDependentRelationship3(String dependentRelationship3) {
		this.dependentRelationship3 = dependentRelationship3;
	}

	public void setDependentDateOfBirth3(String dependentDateOfBirth3) {
		this.dependentDateOfBirth3 = dependentDateOfBirth3;
	}

	public void setDependentName4(String dependentName4) {
		this.dependentName4 = dependentName4;
	}

	public void setDependentRelationship4(String dependentRelationship4) {
		this.dependentRelationship4 = dependentRelationship4;
	}

	public void setDependentDateOfBirth4(String dependentDateOfBirth4) {
		this.dependentDateOfBirth4 = dependentDateOfBirth4;
	}
     
     

}
