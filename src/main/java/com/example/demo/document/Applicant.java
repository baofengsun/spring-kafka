package com.example.demo.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Applicant {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String salary;
	private String location;
	private String nationality;
	private String creditcardType;
	private String emiratesId;
	private String expiryDate;
//	private boolean sent = false;
	
	
	
	
	
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Applicant(Integer id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;

	}
	
	public Applicant(String firstName) {
		super();
//		this.id = id;
		this.firstName = firstName;

	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCreditcardType() {
		return creditcardType;
	}
	public void setCreditcardType(String creditcardType) {
		this.creditcardType = creditcardType;
	}
	public String getEmiratesId() {
		return emiratesId;
	}
	public void setEmiratesId(String emiratesId) {
		this.emiratesId = emiratesId;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
