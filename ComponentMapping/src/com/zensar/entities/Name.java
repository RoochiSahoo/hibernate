package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author Freak
 * @creation_date 26th September 2019
 * @version 1.0
 *
 */

@Embeddable
public class Name {
	@Column(name="first",length = 30)
	
   private String firstname;
   @Column(name="middle")
   private String middlename;
   @Column(nullable = false)
   private String lastname;
 public Name() {
	// TODO Auto-generated constructor stub
}
public Name(String firstname, String middlename, String lastname) {
	super();
	this.firstname = firstname;
	this.middlename = middlename;
	this.lastname = lastname;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getMiddlename() {
	return middlename;
}
public void setMiddlename(String middlename) {
	this.middlename = middlename;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
@Override
public String toString() {
	return "Name [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
}
 
}
