package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author Arib Anwar
 * @creation_Date 27 Sept 1983 11:48PM
 * @version 1.0
 * @description It is a persistance class
 *
 */
@Entity
@Table(name="wage_employee2")


public class WageEmp extends Employee {
	
	private int hours;
	private float rate;
	
	public WageEmp() {
		// TODO Auto-generated constructor stub
	}

	public WageEmp(int empId, String name, LocalDate joiningdate, double salary, int hours, float rate) {
		super(empId, name, joiningdate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}
	

}
