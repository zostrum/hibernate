package com.jvmhub.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jvmhub.tutorial.entity.AppPost;
import com.jvmhub.tutorial.entity.AppUser;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		AppUser user = new AppUser();
		user.setLogin("Testuser");
		user.setPassword("password");
		session.save(user);

		AppPost post = new AppPost();
		post.setName("New Post");
		post.setDescription("This is my first post");
		post.setAb("This is AB");
		session.save(post);

		session.getTransaction().commit();
		session.close();
	}
}
