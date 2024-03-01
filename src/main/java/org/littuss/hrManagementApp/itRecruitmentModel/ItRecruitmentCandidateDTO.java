
package org.littuss.hrManagementApp.itRecruitmentModel;


public class ItRecruitmentCandidateDTO {
       
       private Long itrecruitmentId;
       private String activeStatus;
       private String name;
       private String mobileNumber;
       private String emailId;
       private String higherDegree;
       private String passoutYear;
       private String collegeName;
       private String university;
       private String presentLocation;
       private String referedBy;
       private String source;
       
       
       private String clientMobileNumber;
       private String clientEmailId;
       
       
       private String interviewScheduled;
       private String l1;
       private String l2;
       private String l3;
       private String hrRound;
       
       private String technology;
       private String ctcLpa;
       private String experience;
       private String expectedCtc;
       private String currentLocation;
       private String jobType;
       
       
       private String active;
       private String inActive;
       
       
       public ItRecruitmentCandidateDTO() {
             
       }


       public ItRecruitmentCandidateDTO(String activeStatus,String name, String mobileNumber, String emailId, String higherDegree,
                    String passoutYear, String collegeName, String university, String presentLocation, String referedBy,
                    String source, String clientMobileNumber, String clientEmailId, String interviewScheduled, String l1,
                    String l2, String l3, String hrRound, String technology, String ctcLpa, String experience,
                    String expectedCtc, String currentLocation, String jobType, String active, String inActive) {
             
    	     this.activeStatus = activeStatus;
             this.name = name;
             this.mobileNumber = mobileNumber;
             this.emailId = emailId;
             this.higherDegree = higherDegree;
             this.passoutYear = passoutYear;
             this.collegeName = collegeName;
             this.university = university;
             this.presentLocation = presentLocation;
             this.referedBy = referedBy;
             this.source = source;
             this.clientMobileNumber = clientMobileNumber;
             this.clientEmailId = clientEmailId;
             this.interviewScheduled = interviewScheduled;
             this.l1 = l1;
             this.l2 = l2;
             this.l3 = l3;
             this.hrRound = hrRound;
             this.technology = technology;
             this.ctcLpa = ctcLpa;
             this.experience = experience;
             this.expectedCtc = expectedCtc;
             this.currentLocation = currentLocation;
             this.jobType = jobType;
             this.active = active;
             this.inActive = inActive;
       }
       
       


       public Long getItrecruitmentId() {
		return itrecruitmentId;
	}


	public String getActiveStatus() {
		return activeStatus;
	}


	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}


	public String getName() {
             return name;
       }


       public void setName(String name) {
             this.name = name;
       }


       public String getMobileNumber() {
             return mobileNumber;
       }


       public void setMobileNumber(String mobileNumber) {
             this.mobileNumber = mobileNumber;
       }


       public String getEmailId() {
             return emailId;
       }


       public void setEmailId(String emailId) {
             this.emailId = emailId;
       }


       public String getHigherDegree() {
             return higherDegree;
       }


       public void setHigherDegree(String higherDegree) {
             this.higherDegree = higherDegree;
       }


       public String getPassoutYear() {
             return passoutYear;
       }


       public void setPassoutYear(String passoutYear) {
             this.passoutYear = passoutYear;
       }


       public String getCollegeName() {
             return collegeName;
       }


       public void setCollegeName(String collegeName) {
             this.collegeName = collegeName;
       }


       public String getUniversity() {
             return university;
       }


       public void setUniversity(String university) {
             this.university = university;
       }


       public String getPresentLocation() {
             return presentLocation;
       }


       public void setPresentLocation(String presentLocation) {
             this.presentLocation = presentLocation;
       }


       public String getReferedBy() {
             return referedBy;
       }


       public void setReferedBy(String referedBy) {
             this.referedBy = referedBy;
       }


       public String getSource() {
             return source;
       }


       public void setSource(String source) {
             this.source = source;
       }


       public String getClientMobileNumber() {
             return clientMobileNumber;
       }


       public void setClientMobileNumber(String clientMobileNumber) {
             this.clientMobileNumber = clientMobileNumber;
       }


       public String getClientEmailId() {
             return clientEmailId;
       }


       public void setClientEmailId(String clientEmailId) {
             this.clientEmailId = clientEmailId;
       }


       public String getInterviewScheduled() {
             return interviewScheduled;
       }


       public void setInterviewScheduled(String interviewScheduled) {
             this.interviewScheduled = interviewScheduled;
       }


       public String getL1() {
             return l1;
       }


       public void setL1(String l1) {
             this.l1 = l1;
       }


       public String getL2() {
             return l2;
       }


       public void setL2(String l2) {
             this.l2 = l2;
       }


       public String getL3() {
             return l3;
       }


       public void setL3(String l3) {
             this.l3 = l3;
       }


       public String getHrRound() {
             return hrRound;
       }


       public void setHrRound(String hrRound) {
             this.hrRound = hrRound;
       }


       public String getTechnology() {
             return technology;
       }


       public void setTechnology(String technology) {
             this.technology = technology;
       }


       public String getCtcLpa() {
             return ctcLpa;
       }


       public void setCtcLpa(String ctcLpa) {
             this.ctcLpa = ctcLpa;
       }


       public String getExperience() {
             return experience;
       }


       public void setExperience(String experience) {
             this.experience = experience;
       }


       public String getExpectedCtc() {
             return expectedCtc;
       }


       public void setExpectedCtc(String expectedCtc) {
             this.expectedCtc = expectedCtc;
       }


       public String getCurrentLocation() {
             return currentLocation;
       }


       public void setCurrentLocation(String currentLocation) {
             this.currentLocation = currentLocation;
       }


       public String getJobType() {
             return jobType;
       }


       public void setJobType(String jobType) {
             this.jobType = jobType;
       }


       public String getActive() {
             return active;
       }


       public void setActive(String active) {
             this.active = active;
       }


       public String getInActive() {
             return inActive;
       }


       public void setInActive(String inActive) {
             this.inActive = inActive;
       }
       
       

}

