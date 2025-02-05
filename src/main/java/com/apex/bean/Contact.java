package com.apex.bean;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="contact4")
@Table(name = "contact4")
public class Contact implements Serializable{
	
	private int id;
	private String address;
	private String city;
	private String state;
	private String country;
	private String phoneNumber;
	
    
   
   
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Contact() {
		super();
	}
	@Column(name = "adress")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "state")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name = "country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name = "phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Contact [ address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", phoneNumber=" + phoneNumber +"]";
	}
	public Contact(int id, String address, String city, String state, String country, String phoneNumber
			) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNumber = phoneNumber;
		
	}

}
