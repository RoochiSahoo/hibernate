package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

//hiberanate query language(object oriented query language)
public class HQLMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure();
		//singleton and heavy weight session factory
		SessionFactory f=c.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		//JPA QUERY
		//Query q=s.createQuery("from Product");
		//Query q=s.createQuery("from Product p where p.price between 4000 and 40000");
		//Query q=s.createQuery("from Product p where p.brand like 'c%'");
		/*Query q=s.createQuery("from Product p where p.name='camera' ");
	List<Product> products=q.getResultList();
	for(Product plist:products)
	{
		System.out.println(plist);

	}
		 */
		
		//Query q=s.createQuery("select p.name from Product p");
		/*Query q=s.createQuery("select p.name,p.brand,p.name from Product p");
		List<Object[]> obj = q.getResultList();
		for(Object[] o:obj) {
			for(Object object:o) {
				System.out.println(object);
			}
		}*/
		Query q=s.createQuery("select max(p.price) from Product p");
		Float maxprice=(Float) q.getSingleResult();
		System.out.println(maxprice);
		Query q1=s.createQuery("select min(p.price) from Product p");
		Float minprice=(Float) q1.getSingleResult();
		System.out.println(minprice);
		Query q3=s.createQuery("select sum(p.price) from Product p");
		Double sumprice=(Double) q3.getSingleResult();
		System.out.println(sumprice);
		Query q4=s.createQuery("select avg(p.price) from Product p");
		Double avgprice=(Double) q4.getSingleResult();
		System.out.println(avgprice);
		/*Criteria qc=s.createCriteria(Product.class);
		List<Product> products=qc.list();
				for(Product plist:products)
				{
					System.out.println(plist);

				}*/
				
		
		
		t.commit();
		s.close();

	}

}
