package org.littuss.hrManagementApp.internRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class InternChecklistJoining {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
	
	//checkList of Documents to be submitted on joining
    private String signCopyOfAppointLetter;
    private String passportphotos3;
    private String latestCV;
    private String proofOfIdentity;
    private String dobCertificate;
    private String resignationAcceptanceLetter;
    private String latestPaySlipSalaryCertificate;
    private String educationDegreeCertificateMarksheet;
    private String pancardAcknowledgementSlipOfFrom49;
    
  //NoArgConstructor
	public InternChecklistJoining() {	}

	//ConstructorWithArgument
     public InternChecklistJoining(String signCopyOfAppointLetter, String passportphotos3, String latestCV, String proofOfIdentity,
		String dobCertificate, String resignationAcceptanceLetter, String latestPaySlipSalaryCertificate,
		String educationDegreeCertificateMarksheet, String pancardAcknowledgementSlipOfFrom49) {
	
	this.signCopyOfAppointLetter = signCopyOfAppointLetter;
	this.passportphotos3 = passportphotos3;
	this.latestCV = latestCV;
	this.proofOfIdentity = proofOfIdentity;
	this.dobCertificate = dobCertificate;
	this.resignationAcceptanceLetter = resignationAcceptanceLetter;
	this.latestPaySlipSalaryCertificate = latestPaySlipSalaryCertificate;
	this.educationDegreeCertificateMarksheet = educationDegreeCertificateMarksheet;
	this.pancardAcknowledgementSlipOfFrom49 = pancardAcknowledgementSlipOfFrom49;
}

     //Getters
	public Long getId() {
		return id;
	}

	public String getSignCopyOfAppointLetter() {
		return signCopyOfAppointLetter;
	}

	public String getPassportphotos3() {
		return passportphotos3;
	}

	public String getLatestCV() {
		return latestCV;
	}

	public String getProofOfIdentity() {
		return proofOfIdentity;
	}

	public String getDobCertificate() {
		return dobCertificate;
	}

	public String getResignationAcceptanceLetter() {
		return resignationAcceptanceLetter;
	}

	public String getLatestPaySlipSalaryCertificate() {
		return latestPaySlipSalaryCertificate;
	}

	public String getEducationDegreeCertificateMarksheet() {
		return educationDegreeCertificateMarksheet;
	}

	public String getPancardAcknowledgementSlipOfFrom49() {
		return pancardAcknowledgementSlipOfFrom49;
	}

	//Setters

	public void setSignCopyOfAppointLetter(String signCopyOfAppointLetter) {
		this.signCopyOfAppointLetter = signCopyOfAppointLetter;
	}

	public void setPassportphotos3(String passportphotos3) {
		this.passportphotos3 = passportphotos3;
	}

	public void setLatestCV(String latestCV) {
		this.latestCV = latestCV;
	}

	public void setProofOfIdentity(String proofOfIdentity) {
		this.proofOfIdentity = proofOfIdentity;
	}

	public void setDobCertificate(String dobCertificate) {
		this.dobCertificate = dobCertificate;
	}

	public void setResignationAcceptanceLetter(String resignationAcceptanceLetter) {
		this.resignationAcceptanceLetter = resignationAcceptanceLetter;
	}

	public void setLatestPaySlipSalaryCertificate(String latestPaySlipSalaryCertificate) {
		this.latestPaySlipSalaryCertificate = latestPaySlipSalaryCertificate;
	}

	public void setEducationDegreeCertificateMarksheet(String educationDegreeCertificateMarksheet) {
		this.educationDegreeCertificateMarksheet = educationDegreeCertificateMarksheet;
	}

	public void setPancardAcknowledgementSlipOfFrom49(String pancardAcknowledgementSlipOfFrom49) {
		this.pancardAcknowledgementSlipOfFrom49 = pancardAcknowledgementSlipOfFrom49;
	}
     
     
	
	
    
    
}
