package com.zensar.hibernate.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		Configuration c=new Configuration().configure();
	    SessionFactory s=c.buildSessionFactory();
	    Session k=s.openSession();
	    Transaction transaction=k.beginTransaction();
		
		Country c1=new Country();
		c1.setName("india");
		c1.setLanguage("hindi");
		c1.setPopulation(200000);
		
		Flag f1=new Flag();
		f1.setFlagname("tiaranga");
		f1.setDescription("tricoloured");
		c1.setFlag(f1);
		f1.setCountry(c1);
		k.save(f1);
		k.save(c1);
		transaction.commit();
		k.close();
		System.exit(0);
	}
}
