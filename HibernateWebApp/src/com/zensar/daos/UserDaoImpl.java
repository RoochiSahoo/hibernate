package com.zensar.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


 /**version 2.0
 * @creation_date 21st Sept 2019 5.23PM
 * @modification_date 28st Sept 2019 11.23PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is data  access object Interface implementation. 
 * 				It is also used in Persistent Layer of Application. 
 *				
 */


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import com.zensar.entity.User;

public class UserDaoImpl implements UserDao {
	private Session session;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration con=new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		session=sf.openSession();
	
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.save(user);
		t.commit();
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.update(user);
		t.commit();
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction t=session.beginTransaction();
		session.delete(user);
		t.commit();
		
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		
		
		return session.get(User.class,username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		javax.persistence.Query query = session.createQuery("from User");
		return query.getResultList();
		
	}
	

}