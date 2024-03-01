package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpEducationDetais {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	//Education details 
     private String degree1;
     private String university1;
     private String marksObtained1;
     private String passingYear1;
     
     //Education details 
     private String degree2;
     private String university2;
     private String marksObtained2;
     private String passingYear2;
           
     //Education details 
     private String degree3;
     private String university3;
     private String marksObtained3;
     private String passingYear3;
           
     //Education details 
     private String degree4;
     private String university4;
     private String marksObtained4;
     private String passingYear4;
     
     //NoArgConStructor
	 public EmpEducationDetais() {	}

	public EmpEducationDetais(String degree1, String university1, String marksObtained1, String passingYear1,
			String degree2, String university2, String marksObtained2, String passingYear2, String degree3,
			String university3, String marksObtained3, String passingYear3, String degree4, String university4,
			String marksObtained4, String passingYear4) {
		
		this.degree1 = degree1;
		this.university1 = university1;
		this.marksObtained1 = marksObtained1;
		this.passingYear1 = passingYear1;
		this.degree2 = degree2;
		this.university2 = university2;
		this.marksObtained2 = marksObtained2;
		this.passingYear2 = passingYear2;
		this.degree3 = degree3;
		this.university3 = university3;
		this.marksObtained3 = marksObtained3;
		this.passingYear3 = passingYear3;
		this.degree4 = degree4;
		this.university4 = university4;
		this.marksObtained4 = marksObtained4;
		this.passingYear4 = passingYear4;
	}

	//Getters
	public Long getId() {
		return id;
	}

	public String getDegree1() {
		return degree1;
	}

	public String getUniversity1() {
		return university1;
	}

	public String getMarksObtained1() {
		return marksObtained1;
	}

	public String getPassingYear1() {
		return passingYear1;
	}

	public String getDegree2() {
		return degree2;
	}

	public String getUniversity2() {
		return university2;
	}

	public String getMarksObtained2() {
		return marksObtained2;
	}

	public String getPassingYear2() {
		return passingYear2;
	}

	public String getDegree3() {
		return degree3;
	}

	public String getUniversity3() {
		return university3;
	}

	public String getMarksObtained3() {
		return marksObtained3;
	}

	public String getPassingYear3() {
		return passingYear3;
	}

	public String getDegree4() {
		return degree4;
	}

	public String getUniversity4() {
		return university4;
	}

	public String getMarksObtained4() {
		return marksObtained4;
	}

	public String getPassingYear4() {
		return passingYear4;
	}

	
	//Setters
	public void setDegree1(String degree1) {
		this.degree1 = degree1;
	}

	public void setUniversity1(String university1) {
		this.university1 = university1;
	}

	public void setMarksObtained1(String marksObtained1) {
		this.marksObtained1 = marksObtained1;
	}

	public void setPassingYear1(String passingYear1) {
		this.passingYear1 = passingYear1;
	}

	public void setDegree2(String degree2) {
		this.degree2 = degree2;
	}

	public void setUniversity2(String university2) {
		this.university2 = university2;
	}

	public void setMarksObtained2(String marksObtained2) {
		this.marksObtained2 = marksObtained2;
	}

	public void setPassingYear2(String passingYear2) {
		this.passingYear2 = passingYear2;
	}

	public void setDegree3(String degree3) {
		this.degree3 = degree3;
	}

	public void setUniversity3(String university3) {
		this.university3 = university3;
	}

	public void setMarksObtained3(String marksObtained3) {
		this.marksObtained3 = marksObtained3;
	}

	public void setPassingYear3(String passingYear3) {
		this.passingYear3 = passingYear3;
	}

	public void setDegree4(String degree4) {
		this.degree4 = degree4;
	}

	public void setUniversity4(String university4) {
		this.university4 = university4;
	}

	public void setMarksObtained4(String marksObtained4) {
		this.marksObtained4 = marksObtained4;
	}

	public void setPassingYear4(String passingYear4) {
		this.passingYear4 = passingYear4;
	}
	 
	 
     
}
