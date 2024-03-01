package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpEmergencyContact {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	//Emergency Contact info1
     private String emgName1;
     private String emgRelationship1;
     private String emgLandlineNoWithStd1;
     private String emgMobileNo1;
     
     //Emergency Contact info2
     private String emgName2;
     private String emgRelationship2;
     private String emgLandlineNoWithStd2;
     private String emgMobileNo2;     
     
     //Emergency Contact info3
     private String emgName3;
     private String emgRelationship3;
     private String emgLandlineNoWithStd3;
     private String emgMobileNo3;
     
     //Emergency Contact info4
     private String emgName4;
     private String emgRelationship4;
     private String emgLandlineNoWithStd4;
     private String emgMobileNo4;
     
     //NoArgConstructor
	 public EmpEmergencyContact() {	}

	 //ConstructorWithFields
	public EmpEmergencyContact(String emgName1, String emgRelationship1, String emgLandlineNoWithStd1, String emgMobileNo1,
			String emgName2, String emgRelationship2, String emgLandlineNoWithStd2, String emgMobileNo2,
			String emgName3, String emgRelationship3, String emgLandlineNoWithStd3, String emgMobileNo3,
			String emgName4, String emgRelationship4, String emgLandlineNoWithStd4, String emgMobileNo4) {
		super();
		this.emgName1 = emgName1;
		this.emgRelationship1 = emgRelationship1;
		this.emgLandlineNoWithStd1 = emgLandlineNoWithStd1;
		this.emgMobileNo1 = emgMobileNo1;
		this.emgName2 = emgName2;
		this.emgRelationship2 = emgRelationship2;
		this.emgLandlineNoWithStd2 = emgLandlineNoWithStd2;
		this.emgMobileNo2 = emgMobileNo2;
		this.emgName3 = emgName3;
		this.emgRelationship3 = emgRelationship3;
		this.emgLandlineNoWithStd3 = emgLandlineNoWithStd3;
		this.emgMobileNo3 = emgMobileNo3;
		this.emgName4 = emgName4;
		this.emgRelationship4 = emgRelationship4;
		this.emgLandlineNoWithStd4 = emgLandlineNoWithStd4;
		this.emgMobileNo4 = emgMobileNo4;
	}

	//Getters
	public Long getId() {
		return id;
	}

	public String getEmgName1() {
		return emgName1;
	}

	public String getEmgRelationship1() {
		return emgRelationship1;
	}

	public String getEmgLandlineNoWithStd1() {
		return emgLandlineNoWithStd1;
	}

	public String getEmgMobileNo1() {
		return emgMobileNo1;
	}

	public String getEmgName2() {
		return emgName2;
	}

	public String getEmgRelationship2() {
		return emgRelationship2;
	}

	public String getEmgLandlineNoWithStd2() {
		return emgLandlineNoWithStd2;
	}

	public String getEmgMobileNo2() {
		return emgMobileNo2;
	}

	public String getEmgName3() {
		return emgName3;
	}

	public String getEmgRelationship3() {
		return emgRelationship3;
	}

	public String getEmgLandlineNoWithStd3() {
		return emgLandlineNoWithStd3;
	}

	public String getEmgMobileNo3() {
		return emgMobileNo3;
	}

	public String getEmgName4() {
		return emgName4;
	}

	public String getEmgRelationship4() {
		return emgRelationship4;
	}

	public String getEmgLandlineNoWithStd4() {
		return emgLandlineNoWithStd4;
	}

	public String getEmgMobileNo4() {
		return emgMobileNo4;
	}

	//Setters
	public void setEmgName1(String emgName1) {
		this.emgName1 = emgName1;
	}

	public void setEmgRelationship1(String emgRelationship1) {
		this.emgRelationship1 = emgRelationship1;
	}

	public void setEmgLandlineNoWithStd1(String emgLandlineNoWithStd1) {
		this.emgLandlineNoWithStd1 = emgLandlineNoWithStd1;
	}

	public void setEmgMobileNo1(String emgMobileNo1) {
		this.emgMobileNo1 = emgMobileNo1;
	}

	public void setEmgName2(String emgName2) {
		this.emgName2 = emgName2;
	}

	public void setEmgRelationship2(String emgRelationship2) {
		this.emgRelationship2 = emgRelationship2;
	}

	public void setEmgLandlineNoWithStd2(String emgLandlineNoWithStd2) {
		this.emgLandlineNoWithStd2 = emgLandlineNoWithStd2;
	}

	public void setEmgMobileNo2(String emgMobileNo2) {
		this.emgMobileNo2 = emgMobileNo2;
	}

	public void setEmgName3(String emgName3) {
		this.emgName3 = emgName3;
	}

	public void setEmgRelationship3(String emgRelationship3) {
		this.emgRelationship3 = emgRelationship3;
	}

	public void setEmgLandlineNoWithStd3(String emgLandlineNoWithStd3) {
		this.emgLandlineNoWithStd3 = emgLandlineNoWithStd3;
	}

	public void setEmgMobileNo3(String emgMobileNo3) {
		this.emgMobileNo3 = emgMobileNo3;
	}

	public void setEmgName4(String emgName4) {
		this.emgName4 = emgName4;
	}

	public void setEmgRelationship4(String emgRelationship4) {
		this.emgRelationship4 = emgRelationship4;
	}

	public void setEmgLandlineNoWithStd4(String emgLandlineNoWithStd4) {
		this.emgLandlineNoWithStd4 = emgLandlineNoWithStd4;
	}

	public void setEmgMobileNo4(String emgMobileNo4) {
		this.emgMobileNo4 = emgMobileNo4;
	}

	
	 
     

}
