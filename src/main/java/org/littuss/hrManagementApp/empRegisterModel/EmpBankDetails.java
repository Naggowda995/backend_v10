package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpBankDetails {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	//Bank Details (for salary remittance)
     private String bankName;
     private String bankACNo;
     private String branch;
     private String bankIfscCode;
     
     //NoArgConstructor
	public EmpBankDetails() {	}
	
	//ConstructorWithFields
	public EmpBankDetails(String bankName, String bankACNo, String branch, String bankIfscCode) {
		
		this.bankName = bankName;
		this.bankACNo = bankACNo;
		this.branch = branch;
		this.bankIfscCode = bankIfscCode;
	}
	
	//Getters
	public Long getId() {
		return id;
	}
	public String getBankName() {
		return bankName;
	}
	public String getBankACNo() {
		return bankACNo;
	}
	public String getBranch() {
		return branch;
	}
	public String getBankIfscCode() {
		return bankIfscCode;
	}
	
	
	//Setters
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBankACNo(String bankACNo) {
		this.bankACNo = bankACNo;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}

     

}
