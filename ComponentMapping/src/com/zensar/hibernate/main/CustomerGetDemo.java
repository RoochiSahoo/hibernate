package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure();
		SessionFactory s=c.buildSessionFactory();
		Session k=s.openSession();
		Transaction t=k.beginTransaction();
		
		Customer cust=k.get(Customer.class, 103);
		System.out.println(cust.getcId());
		System.out.println(cust.getAddress());
		System.out.println(cust.getGender());
		System.out.println(cust.getBirthDate());
		//Name customer=cust.getCustomername();
		
		Blob customerphoto=cust.getProfilePhoto();
		try {
			InputStream  fin=customerphoto.getBinaryStream();
			FileOutputStream fout=new FileOutputStream("./resources/arya2.jpg");
			int data=0;
			while((data=fin.read())!=-1){
				fout.write(data);}
			
			Clob description=cust.getDescription();
			Reader r=description.getCharacterStream();
			PrintWriter pw= new PrintWriter("./resources/CustomerInfo.txt");
					int charData=0;
			while((charData=r.read())!=-1) {
				pw.print((char)charData);
			}
			r.close();
			pw.close();
			
					t.commit();
			k.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
