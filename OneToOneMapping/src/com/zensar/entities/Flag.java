package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

import org.hibernate.annotations.JoinColumnOrFormula;

/**
 * 
 * @author Ruchita Sahu
 * @creation_date 27 sept 2019 2:55PM
 * @version 1.0
 * @description It is a persistence class
 *
 */
@Entity

public class Flag {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int flagId;
 private String flagname;
 private String description;
 
 @OneToOne(mappedBy = "flag")
 //@JoinColumn(name="country_id")
 private Country country;
public int getFlagId() {
	return flagId;
}
public void setFlagId(int flagId) {
	this.flagId = flagId;
}
public String getFlagname() {
	return flagname;
}
public void setFlagname(String flagname) {
	this.flagname = flagname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
 
 
}
