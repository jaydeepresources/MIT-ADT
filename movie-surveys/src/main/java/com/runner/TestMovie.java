package com.runner;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Movie;
import com.model.Review;
import com.model.User;

public class TestMovie {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		---Step 1. Insert Users---
		
//		User user1 = new User(0, "Prajakta", "prajakta@gmail.com", "praj@123");
//		User user2 = new User(0, "Arun", "arun@gmail.com", "arun@123");
//		User user3 = new User(0, "Hiren", "hiren@gmail.com", "hiren@123");
//		
//		session.save(user1);
//		session.save(user2);
//		session.save(user3);
		
//		---Step 2. Insert Reviews---
		
//		User user = new User();
//		user.setUserId(4);
//		
//		Movie movie = new Movie();
//		movie.setMovieId(2);
//		
//		Review review1 = new Review(0, "Coco is a very good film.", user, movie);
//		
//		session.save(review1);
		
//		---Fetch All Reviews---	
		Query query = session.createQuery("from reviews");
		List<Review> reviews = query.list();
		
		for (Review review : reviews) {
			System.out.println(review);
			System.out.println(review.getUser());
			System.out.println(review.getMovie());
		}
				
		transaction.commit();
		session.close();
	}

}
