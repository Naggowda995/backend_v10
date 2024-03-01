package org.littuss.hrManagementApp.empRegisterModel;

public class EmployeeDTO {
    
	private Long id;
    private String activeStatus="1";
    private String fullname;
    
    //joining info
    private String joiningDate;
    private String ofcLoc;
    private String jobTitle;
    
    //checkList of Documents to be submitted on joining
    private String signCopyOfAppointLetter;
    private String passportphotos3;
    private String latestCV;
    private String proofOfIdentity;
    private String dobCertificate;
    private String resignationAcceptanceLetter;
    private String latestPaySlipSalaryCertificate;
    private String educationDegreeCertificateMarksheet;
    private String pancardAcknowledgementSlipOfForm49;
    
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
    
    // address info 
    private String presentAddress;
    private String permanentAddress;
    private String mobileNo;
    private String personalEmailId;
    
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
    
          //Experience History/past employee details (in reverse chronological order)
          private String nameOfTheCompany1;
          private String designation1;
          private String dateOfJoining1;
          private String dateOfResigning1;
          private String totalYearsOfExperience1;
          private String remarks1;
          
          private String nameOfTheCompany2;
          private String designation2;
          private String dateOfJoining2;
          private String dateOfResigning2;
          private String totalYearsOfExperience2;
          private String remarks2;
          
          private String nameOfTheCompany3;
          private String designation3;
          private String dateOfJoining3;
          private String dateOfResigning3;
          private String totalYearsOfExperience3;
          private String remarks3;
          
          private String nameOfTheCompany4;
          private String designation4;
          private String dateOfJoining4;
          private String dateOfResigning4;
          private String totalYearsOfExperience4;
          private String remarks4;
          
          //Employee Nomination Details
          private String nameOfNominee;
          private String relationWithTheNominee;
          private String ageOfTheNominee;
          private String addressOftheNominee;
          private String phoneNumberOfTheNominee;
          
          //Bank Details (for salary remittance)
          private String bankName;
          private String bankACNo;
          private String branch;
          private String bankIfscCode;
          
          //Acknowledgement
          private String acknowledgementAgreeName;
          
          //date and signature 
          private String signdate;
          private String empSign;
          
          //NoArgConstructor
		public EmployeeDTO() {		}
		
		//ConstructorWithFields
		public EmployeeDTO(String activeStatus, String fullname, String joiningDate, String ofcLoc, String jobTitle,
				String signCopyOfAppointLetter, String passportphotos3, String latestCV, String proofOfIdentity,
				String dobCertificate, String resignationAcceptanceLetter, String latestPaySlipSalaryCertificate,
				String educationDegreeCertificateMarksheet, String pancardAcknowledgementSlipOfForm49, String title,
				String firstname, String middlename, String lastname, String dob, String gender, String fathersname,
				String mothersname, String maritalstatus, String spousename, String identitymark, String bloodgroup,
				String anyotherAllergies, String passportNo, String panNo, String aadharNo, String pfAccountNoUan,
				String presentAddress, String permanentAddress, String mobileNo, String personalEmailId,
				String dependentName1, String dependentRelationship1, String dependentDateOfBirth1,
				String dependentName2, String dependentRelationship2, String dependentDateOfBirth2,
				String dependentName3, String dependentRelationship3, String dependentDateOfBirth3,
				String dependentName4, String dependentRelationship4, String dependentDateOfBirth4, String emgName1,
				String emgRelationship1, String emgLandlineNoWithStd1, String emgMobileNo1, String emgName2,
				String emgRelationship2, String emgLandlineNoWithStd2, String emgMobileNo2, String emgName3,
				String emgRelationship3, String emgLandlineNoWithStd3, String emgMobileNo3, String emgName4,
				String emgRelationship4, String emgLandlineNoWithStd4, String emgMobileNo4, String degree1,
				String university1, String marksObtained1, String passingYear1, String degree2, String university2,
				String marksObtained2, String passingYear2, String degree3, String university3, String marksObtained3,
				String passingYear3, String degree4, String university4, String marksObtained4, String passingYear4,
				String nameOfTheCompany1, String designation1, String dateOfJoining1, String dateOfResigning1,
				String totalYearsOfExperience1, String remarks1, String nameOfTheCompany2, String designation2,
				String dateOfJoining2, String dateOfResigning2, String totalYearsOfExperience2, String remarks2,
				String nameOfTheCompany3, String designation3, String dateOfJoining3, String dateOfResigning3,
				String totalYearsOfExperience3, String remarks3, String nameOfTheCompany4, String designation4,
				String dateOfJoining4, String dateOfResigning4, String totalYearsOfExperience4, String remarks4,
				String nameOfNominee, String relationWithTheNominee, String ageOfTheNominee, String addressOftheNominee,
				String phoneNumberOfTheNominee, String bankName, String bankACNo, String branch, String bankIfscCode,
				String acknowledgementAgreeName, String signdate, String empSign) {
			this.activeStatus=activeStatus;
			this.fullname = fullname;
			this.joiningDate = joiningDate;
			this.ofcLoc = ofcLoc;
			this.jobTitle = jobTitle;
			this.signCopyOfAppointLetter = signCopyOfAppointLetter;
			this.passportphotos3 = passportphotos3;
			this.latestCV = latestCV;
			this.proofOfIdentity = proofOfIdentity;
			this.dobCertificate = dobCertificate;
			this.resignationAcceptanceLetter = resignationAcceptanceLetter;
			this.latestPaySlipSalaryCertificate = latestPaySlipSalaryCertificate;
			this.educationDegreeCertificateMarksheet = educationDegreeCertificateMarksheet;
			this.pancardAcknowledgementSlipOfForm49 = pancardAcknowledgementSlipOfForm49;
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
			this.presentAddress = presentAddress;
			this.permanentAddress = permanentAddress;
			this.mobileNo = mobileNo;
			this.personalEmailId = personalEmailId;
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
			this.nameOfTheCompany1 = nameOfTheCompany1;
			this.designation1 = designation1;
			this.dateOfJoining1 = dateOfJoining1;
			this.dateOfResigning1 = dateOfResigning1;
			this.totalYearsOfExperience1 = totalYearsOfExperience1;
			this.remarks1 = remarks1;
			this.nameOfTheCompany2 = nameOfTheCompany2;
			this.designation2 = designation2;
			this.dateOfJoining2 = dateOfJoining2;
			this.dateOfResigning2 = dateOfResigning2;
			this.totalYearsOfExperience2 = totalYearsOfExperience2;
			this.remarks2 = remarks2;
			this.nameOfTheCompany3 = nameOfTheCompany3;
			this.designation3 = designation3;
			this.dateOfJoining3 = dateOfJoining3;
			this.dateOfResigning3 = dateOfResigning3;
			this.totalYearsOfExperience3 = totalYearsOfExperience3;
			this.remarks3 = remarks3;
			this.nameOfTheCompany4 = nameOfTheCompany4;
			this.designation4 = designation4;
			this.dateOfJoining4 = dateOfJoining4;
			this.dateOfResigning4 = dateOfResigning4;
			this.totalYearsOfExperience4 = totalYearsOfExperience4;
			this.remarks4 = remarks4;
			this.nameOfNominee = nameOfNominee;
			this.relationWithTheNominee = relationWithTheNominee;
			this.ageOfTheNominee = ageOfTheNominee;
			this.addressOftheNominee = addressOftheNominee;
			this.phoneNumberOfTheNominee = phoneNumberOfTheNominee;
			this.bankName = bankName;
			this.bankACNo = bankACNo;
			this.branch = branch;
			this.bankIfscCode = bankIfscCode;
			this.acknowledgementAgreeName = acknowledgementAgreeName;
			this.signdate = signdate;
			this.empSign = empSign;
		}
		
		
		public Long getId() {
			return id;
		}

		public String getActiveStatus() {
			return activeStatus;
		}

		public void setActiveStatus(String activeStatus) {
			this.activeStatus = activeStatus;
		}

		//getters
		public String getFullname() {
			return fullname;
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
		public String getPancardAcknowledgementSlipOfForm49() {
			return pancardAcknowledgementSlipOfForm49;
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
		public String getPresentAddress() {
			return presentAddress;
		}
		public String getPermanentAddress() {
			return permanentAddress;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public String getPersonalEmailId() {
			return personalEmailId;
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
		public String getNameOfTheCompany1() {
			return nameOfTheCompany1;
		}
		public String getDesignation1() {
			return designation1;
		}
		public String getDateOfJoining1() {
			return dateOfJoining1;
		}
		public String getDateOfResigning1() {
			return dateOfResigning1;
		}
		public String getTotalYearsOfExperience1() {
			return totalYearsOfExperience1;
		}
		public String getRemarks1() {
			return remarks1;
		}
		public String getNameOfTheCompany2() {
			return nameOfTheCompany2;
		}
		public String getDesignation2() {
			return designation2;
		}
		public String getDateOfJoining2() {
			return dateOfJoining2;
		}
		public String getDateOfResigning2() {
			return dateOfResigning2;
		}
		public String getTotalYearsOfExperience2() {
			return totalYearsOfExperience2;
		}
		public String getRemarks2() {
			return remarks2;
		}
		public String getNameOfTheCompany3() {
			return nameOfTheCompany3;
		}
		public String getDesignation3() {
			return designation3;
		}
		public String getDateOfJoining3() {
			return dateOfJoining3;
		}
		public String getDateOfResigning3() {
			return dateOfResigning3;
		}
		public String getTotalYearsOfExperience3() {
			return totalYearsOfExperience3;
		}
		public String getRemarks3() {
			return remarks3;
		}
		public String getNameOfTheCompany4() {
			return nameOfTheCompany4;
		}
		public String getDesignation4() {
			return designation4;
		}
		public String getDateOfJoining4() {
			return dateOfJoining4;
		}
		public String getDateOfResigning4() {
			return dateOfResigning4;
		}
		public String getTotalYearsOfExperience4() {
			return totalYearsOfExperience4;
		}
		public String getRemarks4() {
			return remarks4;
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
		public String getAcknowledgementAgreeName() {
			return acknowledgementAgreeName;
		}
		public String getSigndate() {
			return signdate;
		}
		public String getEmpSign() {
			return empSign;
		}
		//setterrs
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public void setJoiningDate(String joiningDate) {
			this.joiningDate = joiningDate;
		}
		public void setOfcLoc(String ofcLoc) {
			this.ofcLoc = ofcLoc;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
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
		public void setPancardAcknowledgementSlipOfForm49(String pancardAcknowledgementSlipOfForm49) {
			this.pancardAcknowledgementSlipOfForm49 = pancardAcknowledgementSlipOfForm49;
		}
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
		public void setPresentAddress(String presentAddress) {
			this.presentAddress = presentAddress;
		}
		public void setPermanentAddress(String permanentAddress) {
			this.permanentAddress = permanentAddress;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public void setPersonalEmailId(String personalEmailId) {
			this.personalEmailId = personalEmailId;
		}
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
		public void setNameOfTheCompany1(String nameOfTheCompany1) {
			this.nameOfTheCompany1 = nameOfTheCompany1;
		}
		public void setDesignation1(String designation1) {
			this.designation1 = designation1;
		}
		public void setDateOfJoining1(String dateOfJoining1) {
			this.dateOfJoining1 = dateOfJoining1;
		}
		public void setDateOfResigning1(String dateOfResigning1) {
			this.dateOfResigning1 = dateOfResigning1;
		}
		public void setTotalYearsOfExperience1(String totalYearsOfExperience1) {
			this.totalYearsOfExperience1 = totalYearsOfExperience1;
		}
		public void setRemarks1(String remarks1) {
			this.remarks1 = remarks1;
		}
		public void setNameOfTheCompany2(String nameOfTheCompany2) {
			this.nameOfTheCompany2 = nameOfTheCompany2;
		}
		public void setDesignation2(String designation2) {
			this.designation2 = designation2;
		}
		public void setDateOfJoining2(String dateOfJoining2) {
			this.dateOfJoining2 = dateOfJoining2;
		}
		public void setDateOfResigning2(String dateOfResigning2) {
			this.dateOfResigning2 = dateOfResigning2;
		}
		public void setTotalYearsOfExperience2(String totalYearsOfExperience2) {
			this.totalYearsOfExperience2 = totalYearsOfExperience2;
		}
		public void setRemarks2(String remarks2) {
			this.remarks2 = remarks2;
		}
		public void setNameOfTheCompany3(String nameOfTheCompany3) {
			this.nameOfTheCompany3 = nameOfTheCompany3;
		}
		public void setDesignation3(String designation3) {
			this.designation3 = designation3;
		}
		public void setDateOfJoining3(String dateOfJoining3) {
			this.dateOfJoining3 = dateOfJoining3;
		}
		public void setDateOfResigning3(String dateOfResigning3) {
			this.dateOfResigning3 = dateOfResigning3;
		}
		public void setTotalYearsOfExperience3(String totalYearsOfExperience3) {
			this.totalYearsOfExperience3 = totalYearsOfExperience3;
		}
		public void setRemarks3(String remarks3) {
			this.remarks3 = remarks3;
		}
		public void setNameOfTheCompany4(String nameOfTheCompany4) {
			this.nameOfTheCompany4 = nameOfTheCompany4;
		}
		public void setDesignation4(String designation4) {
			this.designation4 = designation4;
		}
		public void setDateOfJoining4(String dateOfJoining4) {
			this.dateOfJoining4 = dateOfJoining4;
		}
		public void setDateOfResigning4(String dateOfResigning4) {
			this.dateOfResigning4 = dateOfResigning4;
		}
		public void setTotalYearsOfExperience4(String totalYearsOfExperience4) {
			this.totalYearsOfExperience4 = totalYearsOfExperience4;
		}
		public void setRemarks4(String remarks4) {
			this.remarks4 = remarks4;
		}
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
