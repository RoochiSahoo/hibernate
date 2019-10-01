package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
/**
 * 
 * @author Arib Anwar
 * @creation_Date 27 Sept 1947
 * @version 1.0
 * @description It is a persist
 *
 */
@Entity
@Table(name = "Emp_master")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "emp_type",discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("2")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name;
	private LocalDate joiningdate;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, LocalDate joiningdate, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.joiningdate = joiningdate;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joiningdate=" + joiningdate + ", salary=" + salary
				+ "]";
	}
	

}
