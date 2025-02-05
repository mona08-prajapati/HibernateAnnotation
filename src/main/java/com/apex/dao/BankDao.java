package com.apex.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.apex.bean.Bank;
import com.apex.bean.Person;
import com.apex.util.DbUtil;
import com.apex.util.HibernateConnector;
@Repository
public class BankDao {
	public Bank addBank(Bank user) {
		
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

}
