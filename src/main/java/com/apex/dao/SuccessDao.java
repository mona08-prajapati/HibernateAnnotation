package com.apex.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.apex.bean.Bank;
import com.apex.bean.Contact;
import com.apex.bean.Person;
import com.apex.util.HibernateConnector;

@Repository
public class SuccessDao {
	public List<Person> getAllPerson() {
		Session session = null;
		Transaction transaction = null;
		List<Person> person = null;

		try {

		session = HibernateConnector.getInstance().getSession();
		transaction = session.beginTransaction();
		Query<Person> query = session.createQuery("FROM person2", Person.class);
		person = query.getResultList();
		transaction.commit();
		} catch (Exception e) {
		e.printStackTrace();
		if (transaction != null) {
		transaction.rollback();
		}
		} finally {
		if (session != null) {
		session.close();
		}
		}
		return person;
		}
	public List<Contact> getAllContact() {
		Session session = null;
		Transaction transaction = null;
		List<Contact> contact = null;

		try {

		session = HibernateConnector.getInstance().getSession();
		transaction = session.beginTransaction();
		Query<Contact> query = session.createQuery("FROM contact3", Contact.class);
		contact = query.getResultList();
		transaction.commit();
		} catch (Exception e) {
		e.printStackTrace();
		if (transaction != null) {
		transaction.rollback();
		}
		} finally {
		if (session != null) {
		session.close();
		}
		}
		return contact;
		}
	public List<Bank> getAllBank() {
		Session session = null;
		Transaction transaction = null;
		List<Bank> bank = null;

		try {

		session = HibernateConnector.getInstance().getSession();
		transaction = session.beginTransaction();
		Query<Bank> query = session.createQuery("FROM bank4", Bank.class);
		bank = query.getResultList();
		transaction.commit();
		} catch (Exception e) {
		e.printStackTrace();
		if (transaction != null) {
		transaction.rollback();
		}
		} finally {
		if (session != null) {
		session.close();
		}
		}
		return bank;
		}

}
