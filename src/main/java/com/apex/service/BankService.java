package com.apex.service;

import com.apex.bean.Bank;
import com.apex.dao.BankDao;

public class BankService {
	public static void main(String[] args) {
		Bank user = new Bank();
		user.setId(1);
		user.setBankname("Fremont bank");
		user.setAccount("223333");
		user.setSsn("3333");
		
		
		BankDao bankDao = new BankDao();
		bankDao.addBank(user);
	}


}
