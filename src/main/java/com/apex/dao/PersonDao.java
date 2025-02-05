package com.apex.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apex.util.DbUtil;
import com.apex.util.HibernateConnector;
import com.apex.bean.Person;
import com.apex.dao.PersonDao;

@Repository
public class PersonDao {
	
	public String addUser(String user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;}
        }
        public boolean deleteUser(int id) {
        	
        		Session session = null;
        		Transaction transaction = null;

        		try {
        		session = HibernateConnector.getInstance().getSession();
        		transaction = session.beginTransaction();

        		Person person = session.get(Person.class,id);
        		if(person != null) {
        		session.delete(person);
        		transaction.commit();
        		return true;
        		} else {
        		return false;
        		}
        		} catch (Exception e) {
        		if(transaction != null) {
        		transaction.rollback();
        		}
        		e.printStackTrace();
        		return false;
        		}
             }
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
        		
        	public Person updatePerson( Person person,int id) {
        			Session session = null;
        			Transaction transaction = null;
        			try {

        			session = HibernateConnector.getInstance().getSession();
        			System.out.println("session : " + session);
        			transaction = session.beginTransaction();
        			session.saveOrUpdate(person);
        			transaction.commit();
        			return person;

        			} catch (Exception e) {
        			e.printStackTrace();
        			return null;
        			}
        	}
        	public Person getPerson(int id) {
        				Session session = null;
        				try {
        				session = HibernateConnector.getInstance().getSession();
        				return session.get(Person.class, id);
        				} catch (Exception e) {
        				e.printStackTrace();
        				return null;
        				}
        				}
        			
        		
    }
