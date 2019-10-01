package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f=c.buildSessionFactory();
	Session s=f.openSession();
	Transaction t=s.beginTransaction();
	//insert new record
	
	//Product pro=new Product(1011,"camera","canon",60000);
	//s.save(pro);
	//get record according to primary key
	/*Product product1=s.get(Product.class,1001);
	if(product1.equals(null))
			{System.out.println("product not found");	}
	else
	{System.out.println("found");}*/
	//System.out.println(product1);
	/*Product product1=s.get(Product.class,1001);
	if(product1.equals(null))
		System.out.println("not exist");
				
	else
		{float m=product1.getPrice();
		product1.setPrice(m+2000.00f);
		}*/
	//delete record
	Product product1=s.get(Product.class,1001);
	if(product1.equals(null))
	{
		System.out.println("nothing");
	}
	else {
		s.delete(product1);
	}
	
	
		t.commit();
     	s.close();

	}

}
