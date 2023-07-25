package com.example.patientservice.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientId")
    private Long patientId;
    
    private String npiId;



	private int accountNo;
	private String prefix;
	private String lastName;
	private String suffix;
	private String firstName;
	private String middleName;

	private String preferredName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String county;
	private String zip;
	private String country;
	private String email;
	private LocalDate dateOfBirth;
	private String gender;
	private String ssn;
	private String primaryPhoneNumber;
	private String 	secondaryPhoneNumber;
	private String releaseOfInfo;
	private String empStatus;
	private String ethnicity;
	private String language;
	private String pcp;
	private String pcg;
	private String prescriptionHistoryConsent;
	private String maritalStatus;
	private double outStandingBalance;
	private String profileImage;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id", referencedColumnName = "patientId")
	private List<EmergencyContact> emergencyContact;
	
	private String emailPermission;
	private String textPermission;
	private String voicePermission;
	private String preferredModeOfCommunication;
	
    @Column(nullable = false, columnDefinition = "boolean default true")
	private boolean selfResponsibleFlag;



	public boolean isSelfResponsibleFlag() {
		return selfResponsibleFlag;
	}
	public boolean getSelfResponsibleFlag() {
		return selfResponsibleFlag;
	}

	public void setSelfResponsibleFlag(boolean selfResponsibleFlag) {
		this.selfResponsibleFlag = selfResponsibleFlag;
	}

	public String getEmailPermission() {
		return emailPermission;
	}

	public void setEmailPermission(String emailPermission) {
		this.emailPermission = emailPermission;
	}

	public String getTextPermission() {
		return textPermission;
	}

	public void setTextPermission(String textPermission) {
		this.textPermission = textPermission;
	}

	public String getVoicePermission() {
		return voicePermission;
	}

	public void setVoicePermission(String voicePermission) {
		this.voicePermission = voicePermission;
	}

	public String getPreferredModeOfCommunication() {
		return preferredModeOfCommunication;
	}

	public void setPreferredModeOfCommunication(String preferredModeOfCommunication) {
		this.preferredModeOfCommunication = preferredModeOfCommunication;
	}
		
	public String getNpiId() {
		return npiId;
	}

	public void setNpiId(String npiId) {
		this.npiId = npiId;
	}


	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}





	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "emergencyContactId", referencedColumnName =
	 * "emergencyContactId") private List<EmergencyContact> emergencyContact;
	 */
	/*@Lob
	private byte[] picture;*/


	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}




	public double getOutStandingBalance() {

		return outStandingBalance;
	}

	public void setOutStandingBalance(double outStandingBalance) {
		this.outStandingBalance = outStandingBalance;

	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	public String getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
	}



	public String getReleaseOfInfo() {
		return releaseOfInfo;
	}

	public void setReleaseOfInfo(String releaseOfInfo) {
		this.releaseOfInfo = releaseOfInfo;
	}



	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPcp() {
		return pcp;
	}

	public void setPcp(String pcp) {
		this.pcp = pcp;
	}

	public String getPcg() {
		return pcg;
	}

	public void setPcg(String pcg) {
		this.pcg = pcg;
	}

	public String getPrescriptionHistoryConsent() {
		return prescriptionHistoryConsent;
	}

	public void setPrescriptionHistoryConsent(String prescriptionHistoryConsent) {
		this.prescriptionHistoryConsent = prescriptionHistoryConsent;
	}

	/*public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}*/

   
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



	public List<EmergencyContact> getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(List<EmergencyContact> emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	

    public Long getId() {
        return patientId;
    }

    public void setId(Long patientId) {
        this.patientId = patientId;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
