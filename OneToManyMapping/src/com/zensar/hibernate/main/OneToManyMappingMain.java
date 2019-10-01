package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration().configure();
		SessionFactory f=config.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		
		Movie m=new Movie();
		m.setMovieTitle("Threeidiots");
		m.setReleaseDate(LocalDate.of(2000, 12, 9));
		Song song=new Song("give me some sunshine");
		Song song1=new Song("All is well");
		Song song2=new Song("zoobi dooobi");
		song.setMovie(m);
		song1.setMovie(m);
		song2.setMovie(m);
		ArrayList<Song> song5=new ArrayList<Song>();
		song5.add(song);
		song5.add(song1);
		song5.add(song2);
		s.save(m);
		s.save(song);
		s.save(song1);
		s.save(song2);
		
		t.commit();
		s.close();
		System.exit(0);
	}

}
