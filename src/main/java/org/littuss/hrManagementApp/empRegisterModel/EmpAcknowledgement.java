package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpAcknowledgement {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	//Acknowledgement
     private String acknowledgementAgreeName;
     
     //date and signature 
     private String signdate;
     private String empSign;
     
     //NoArgConstructor
	public EmpAcknowledgement() {	}
	
	//ConstructorWithFields
	public EmpAcknowledgement(String acknowledgementAgreeName, String signdate, String empSign) {
		
		this.acknowledgementAgreeName = acknowledgementAgreeName;
		this.signdate = signdate;
		this.empSign = empSign;
	}
	
	//Getters
	public Long getId() {
		return id;
	}
	public String getAcknowledgementAgreeName() {
		return acknowledgementAgreeName;
	}
	public String getSigndate() {
		return signdate;
	}
	public String getEmpSign() {
		return empSign;
	}
	
	//Setters
	public void setAcknowledgementAgreeName(String acknowledgementAgreeName) {
		this.acknowledgementAgreeName = acknowledgementAgreeName;
	}
	public void setSigndate(String signdate) {
		this.signdate = signdate;
	}
	public void setEmpSign(String empSign) {
		this.empSign = empSign;
	}
     
     

}
