package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * 
 * @author Freak
 * @creation_Date 26th September 2019 14:54PM
 * @version 1.0
 *
 */
@Entity
@Table(name="customer")


public class Customer

{
	@Id
	@Column(name="cId")
	private int cId;
	private Name customername;
	private String gender;
	private int age;
	private String address;
	private LocalDate birthDate;
	private Blob profilePhoto;
	private Clob description;
public Customer() {
	// TODO Auto-generated constructor stub
}


public Customer(int cId, Name customername, String gender, int age, String address) {
	super();
	this.cId = cId;
	this.customername = customername;
	this.gender = gender;
	this.age = age;
	this.address = address;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public Name getCustomername() {
	return customername;
}
public void setCustomername(Name customername) {
	this.customername = customername;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public LocalDate getBirthDate() {
	return birthDate;
}


public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}


public Blob getProfilePhoto() {
	return profilePhoto;
}


public void setProfilePhoto(Blob profilePhoto) {
	this.profilePhoto = profilePhoto;
}


public Clob getDescription() {
	return description;
}


public void setDescription(Clob description) {
	this.description = description;
}


@Override
public String toString() {
	return "Customer [cId=" + cId + ", customername=" + customername + ", gender=" + gender + ", age=" + age + "]";
}

}
