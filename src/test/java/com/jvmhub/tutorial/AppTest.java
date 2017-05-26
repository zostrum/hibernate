package com.jvmhub.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jvmhub.tutorial.entity.AppUser;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		AppUser user = new AppUser();
		session.save(user);

		session.getTransaction().commit();
		session.close();
	}
}