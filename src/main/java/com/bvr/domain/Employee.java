package com.bvr.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int emp_id;
	
	
	public String firstName;
	public String lastName;
	public String gender;
	public String dob;
	public String panNum;
	public String aadhaarNum;
	public String mobileNum;
	public String emailId;
	public String officeMail;
	public String permanentAddress;
	public String presentAddress;
	public String bloodGroup;
	public String profilePict;
	public String doj;
	public String empLevel;
	public String postName;
	public int basicPay;
	public int houseAllowance;
	
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public String getAadhaarNum() {
		return aadhaarNum;
	}
	public void setAadhaarNum(String aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOfficeMail() {
		return officeMail;
	}
	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getProfilePict() {
		return profilePict;
	}
	public void setProfilePict(String profilePict) {
		this.profilePict = profilePict;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(String empLevel) {
		this.empLevel = empLevel;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getHouseAllowance() {
		return houseAllowance;
	}
	public void setHouseAllowance(int houseAllowance) {
		this.houseAllowance = houseAllowance;
	}
	
	
	public Employee(String firstName, String lastName, String gender, String dob, String panNum, String aadhaarNum,
			String mobileNum, String emailId, String officeMail, String permanentAddress, String presentAddress,
			String bloodGroup, String profilePict, String doj, String empLevel, String postName, int basicPay,
			int houseAllowance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.panNum = panNum;
		this.aadhaarNum = aadhaarNum;
		this.mobileNum = mobileNum;
		this.emailId = emailId;
		this.officeMail = officeMail;
		this.permanentAddress = permanentAddress;
		this.presentAddress = presentAddress;
		this.bloodGroup = bloodGroup;
		this.profilePict = profilePict;
		this.doj = doj;
		this.empLevel = empLevel;
		this.postName = postName;
		this.basicPay = basicPay;
		this.houseAllowance = houseAllowance;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dob=" + dob + ", panNum=" + panNum + ", aadhaarNum=" + aadhaarNum + ", mobileNum="
				+ mobileNum + ", emailId=" + emailId + ", officeMail=" + officeMail + ", permanentAddress="
				+ permanentAddress + ", presentAddress=" + presentAddress + ", bloodGroup=" + bloodGroup
				+ ", profilePict=" + profilePict + ", doj=" + doj + ", empLevel=" + empLevel + ", postName=" + postName
				+ ", basicPay=" + basicPay + ", houseAllowance=" + houseAllowance + ", getEmp_id()=" + getEmp_id()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getGender()="
				+ getGender() + ", getDob()=" + getDob() + ", getPanNum()=" + getPanNum() + ", getAadhaarNum()="
				+ getAadhaarNum() + ", getMobileNum()=" + getMobileNum() + ", getEmailId()=" + getEmailId()
				+ ", getOfficeMail()=" + getOfficeMail() + ", getPermanentAddress()=" + getPermanentAddress()
				+ ", getPresentAddress()=" + getPresentAddress() + ", getBloodGroup()=" + getBloodGroup()
				+ ", getProfilePict()=" + getProfilePict() + ", getDoj()=" + getDoj() + ", getEmpLevel()="
				+ getEmpLevel() + ", getPostName()=" + getPostName() + ", getBasicPay()=" + getBasicPay()
				+ ", getHouseAllowance()=" + getHouseAllowance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
