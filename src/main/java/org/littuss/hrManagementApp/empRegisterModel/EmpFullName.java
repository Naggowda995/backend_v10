package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpFullName {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String fullname;

//NoArgConstructor
public EmpFullName() {  }

//ConstructorWithFields
public EmpFullName(String fullname) {
	this.fullname = fullname;
}

//getters
public Long getId() {
	return id;
}
public String getFullname() {
	return fullname;
}

//setters
public void setFullname(String fullname) {
	this.fullname = fullname;
}


}