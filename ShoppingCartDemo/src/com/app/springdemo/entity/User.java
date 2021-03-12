package com.app.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="gender")
	private String gender;
	@Column(name="country")
	private String country;
	@Column(name="terms")
	private String terms;
	@Column(name="phone")
	private String phone;
	@Column(name="city")
	private String city;
	@Column(name="addressone")
	private String addressone;
	@Column(name="addresstwo")
	private String addresstwo;
	@Column(name="email")
	private String email;
	@Column(name="pincode")
	private String pincode;
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressone() {
		return addressone;
	}

	public void setAddressone(String addressone) {
		this.addressone = addressone;
	}

	public String getAddresstwo() {
		return addresstwo;
	}

	public void setAddresstwo(String addresstwo) {
		this.addresstwo = addresstwo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User()
	{}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}




	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	

	
	
	
	

}
