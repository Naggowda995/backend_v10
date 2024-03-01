package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpNominee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	//Employee Nomination Details
     private String nameOfNominee;
     private String relationWithTheNominee;
     private String ageOfTheNominee;
     private String addressOftheNominee;
     private String phoneNumberOfTheNominee;
     
     //NoArgConstructor
	public EmpNominee() {	}
	
	//ConstructorWithFields
	public EmpNominee(String nameOfNominee, String relationWithTheNominee, String ageOfTheNominee,
			String addressOftheNominee, String phoneNumberOfTheNominee) {
		 
		this.nameOfNominee = nameOfNominee;
		this.relationWithTheNominee = relationWithTheNominee;
		this.ageOfTheNominee = ageOfTheNominee;
		this.addressOftheNominee = addressOftheNominee;
		this.phoneNumberOfTheNominee = phoneNumberOfTheNominee;
	}
	
	//Getters
	public Long getId() {
		return id;
	}
	public String getNameOfNominee() {
		return nameOfNominee;
	}
	public String getRelationWithTheNominee() {
		return relationWithTheNominee;
	}
	public String getAgeOfTheNominee() {
		return ageOfTheNominee;
	}
	public String getAddressOftheNominee() {
		return addressOftheNominee;
	}
	public String getPhoneNumberOfTheNominee() {
		return phoneNumberOfTheNominee;
	}
	
	//Setters
	public void setNameOfNominee(String nameOfNominee) {
		this.nameOfNominee = nameOfNominee;
	}
	public void setRelationWithTheNominee(String relationWithTheNominee) {
		this.relationWithTheNominee = relationWithTheNominee;
	}
	public void setAgeOfTheNominee(String ageOfTheNominee) {
		this.ageOfTheNominee = ageOfTheNominee;
	}
	public void setAddressOftheNominee(String addressOftheNominee) {
		this.addressOftheNominee = addressOftheNominee;
	}
	public void setPhoneNumberOfTheNominee(String phoneNumberOfTheNominee) {
		this.phoneNumberOfTheNominee = phoneNumberOfTheNominee;
	}
     
     

 

}
