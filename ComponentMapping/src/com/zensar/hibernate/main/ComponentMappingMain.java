package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure();
		SessionFactory s=c.buildSessionFactory();
		Session k=s.openSession();
		Transaction t=k.beginTransaction();

		Name name=new Name();
		name.setFirstname("roach");
		name.setMiddlename(" ");
		name.setLastname("sahu");



		Customer customer=new Customer(103,name,"female",21,"ranchi");
  customer.setBirthDate(LocalDate.of(1997, 12, 22));
  try {
	File photo=new File("./resources/arya.jpg");
	  FileInputStream fil=new FileInputStream(photo);
	  Blob customerphoto=BlobProxy.generateProxy(fil,photo.length());
	  customer.setProfilePhoto(customerphoto);
	  
	  File file2=new File("./resources/CustomerInfo.txt");
	  FileReader fr=new  FileReader (file2);
	  Clob description=ClobProxy.generateProxy(fr, file2.length());
	  customer.setDescription(description);
	        k.save(customer);
			t.commit();
			k.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

