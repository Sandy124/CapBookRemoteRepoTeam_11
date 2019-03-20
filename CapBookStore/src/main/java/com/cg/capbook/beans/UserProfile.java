package com.cg.capbook.beans;

import java.sql.Date;

public class UserProfile {
	private String fName;
	private String lName;
	private String gender;
	private long mobileNo;
	private Date dateOfBirth;
	private Address address;

	public UserProfile() {}

	public UserProfile(String fName, String lName, String gender, long mobileNo, Date dateOfBirth, Address address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserProfile [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}

	
}
