package com.apex.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.apex.bean.Contact;
import com.apex.bean.Person;
import org.hibernate.cfg.AnnotationConfiguration;

public class DbUtil {
	private static SessionFactory sessionFactory;

	private static Configuration configuration;

	// Create the initial SessionFactory from the default configuration files
	static {
		try {
			configuration = new Configuration();
			sessionFactory = configuration.configure().buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}}
