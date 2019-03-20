package com.cg.capbook.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private int addressId;
	private String houseNo;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String pinCode;
	private String country;

	private int userId;

	public Address() {

	}
	public Address(Integer addressId, String houseNo, String street, String locality, String city, String state,
			String pinCode, String country, Integer userId) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
		this.userId = userId;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + ", locality="
				+ locality + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", country=" + country
				+ ", userId=" + userId + "]";
	}
}
