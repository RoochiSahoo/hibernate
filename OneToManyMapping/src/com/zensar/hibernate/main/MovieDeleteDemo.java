package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {
	public static void main(String[] args) {
		
	
	Configuration config=new Configuration().configure();
	SessionFactory f=config.buildSessionFactory();
	Session s=f.openSession();
	Transaction t=s.beginTransaction();
	Movie m=s.get(Movie.class,1);
			System.out.println(m.getMovieTitle());
			System.out.println(m.getReleaseDate());
			List<Song> u=m.getSongs();
			for(Song z:u)
			{
				System.out.println(z);
			}
			if(m!=null)
			{
				s.delete(m);
			}
			else
			{
				System.out.println("not found");
			}
			
	t.commit();
	s.close();
	System.exit(0);

}
}