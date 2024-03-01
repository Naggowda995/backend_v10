package org.littuss.hrManagementApp.vendorDetailsModel;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;


@Entity
@Table(name="VendorDetails")


public class VendorDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vendorName;
    private String rateCard;
    private String location;
    private String jobType;
    private String payRoll;
    private String candidateName;
    private String candidateLocation;
    private String technology;
    private String firstReviewed;
    private String secondReviewed;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] cvFormat; // Added field for storing file content
    
    private String activeStatus="1";
    
    public VendorDetails() {
        
    }


   public VendorDetails( String vendorName, String rateCard, String location, String jobType, String payRoll,
            String candidateName, String candidateLocation, String technology, String firstReviewed,
            String secondReviewed, byte[] cvFormat) {
        this.vendorName = vendorName;
        this.rateCard = rateCard;
        this.location = location;
        this.jobType = jobType;
        this.payRoll = payRoll;
        this.candidateName = candidateName;
        this.candidateLocation = candidateLocation;
        this.technology = technology;
        this.firstReviewed = firstReviewed;
        this.secondReviewed = secondReviewed;
        this.cvFormat = cvFormat;
    }


   
    public String getActiveStatus() {
        return activeStatus;
    }


   public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }


   //getters
    public Long getId() {
        return id;
    }


   public String getVendorName() {
        return vendorName;
    }


   public String getRateCard() {
        return rateCard;
    }


   public String getLocation() {
        return location;
    }


   public String getJobType() {
        return jobType;
    }


   public String getPayRoll() {
        return payRoll;
    }


   public String getCandidateName() {
        return candidateName;
    }


   public String getCandidateLocation() {
        return candidateLocation;
    }


   public String getTechnology() {
        return technology;
    }


   public String getFirstReviewed() {
        return firstReviewed;
    }


   public String getSecondReviewed() {
        return secondReviewed;
    }


   public byte[] getCvFormat() {
        return cvFormat;
    }


    //setters
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


   public void setRateCard(String rateCard) {
        this.rateCard = rateCard;
    }


   public void setLocation(String location) {
        this.location = location;
    }


   public void setJobType(String jobType) {
        this.jobType = jobType;
    }


   public void setPayRoll(String payRoll) {
        this.payRoll = payRoll;
    }


   public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }


   public void setCandidateLocation(String candidateLocation) {
        this.candidateLocation = candidateLocation;
    }


   public void setTechnology(String technology) {
        this.technology = technology;
    }


   public void setFirstReviewed(String firstReviewed) {
        this.firstReviewed = firstReviewed;
    }


   public void setSecondReviewed(String secondReviewed) {
        this.secondReviewed = secondReviewed;
    }


   public void setCvFormat(byte[] cvFormat) {
        this.cvFormat = cvFormat;
    }


}