package com.zensar.hibernate.main;

import java.sql.Connection;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration connection=new Configuration().configure();
		//singleton  heavy and weight session
		SessionFactory s=connection.buildSessionFactory();
	Session k=s.openSession();
	Transaction transaction=k.beginTransaction();
		
		 Employee e=new Employee();
		 e.setName("Freak");
		 e.setSalary(2000);
		e.setJoiningdate(LocalDate.of(2019,2,4));
		k.save(e);
		WageEmp emp=new WageEmp();
	emp.setName("Arib");
	emp.setSalary(90000);
	emp.setJoiningdate(LocalDate.of(2018, 3, 6));
	emp.setRate(45.9f);
	emp.setHours(12);
	k.save(emp);
	transaction.commit();
	k.close();
		
	}

}
