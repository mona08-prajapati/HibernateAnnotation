package com.apex.service;

import com.apex.bean.Contact;
import com.apex.dao.ContactDao;
public class ContactService {
	ContactDao contactDao = new ContactDao();
	public static void main(String[] args) {
		ContactService contactService = new ContactService();
		Contact createContact = contactService.createContact();
	}
		public Contact createContact() {
			Contact user = new Contact();
			user.setAddress("wwerrttttyyt");
			user.setCity("fremont");
			user.setState("t");
			user.setCountry("ca");
			user.setPhoneNumber("123456784567");
			ContactDao contactDao = new ContactDao();
			contactDao.addContact(user);
		    return user;
		
	
}}