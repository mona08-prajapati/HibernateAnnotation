package com.apex.service;

import com.apex.dao.PersonDao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.apex.bean.Person;
@Service
public class PersonService 
{
	PersonDao personDao = new PersonDao();
	
	public static void main(String[] args) 
	{
		System.out.print("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		PersonService personService = new PersonService();
		Person createPerson = personService.createPerson();
	}
		public Person createPerson() {
			Person user = new Person();
			user.setFirstname("neha");
			user.setLastname("Prajapati");
			user.setMiddlename("t");
			user.setGender("Female");
			PersonDao personDao = new PersonDao();
		    personDao.addUser(user);
		    return user;
		
	}
		public void deleteUser(Integer id)
		{
			personDao.deleteUser(id);
	        System.out.println("person Deleted Success");
	    }
		public List<Person> getAllPerson() 
		{
			Person person = new Person();
			if(person!=null) {
				System.out.println("firstname : " + person.getFirstname());
				System.out.println("gender : " + person.getGender());
				System.out.println("lastname : " + person.getLastname());
				System.out.println("middlename : " + person.getMiddlename());
			}
	        return personDao.getAllPerson();
	    }
	 

	}

	
