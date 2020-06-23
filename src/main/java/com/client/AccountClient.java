package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigurationAccount;
import com.dao.AccountDao;

public class AccountClient {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationAccount.class);
		AccountDao accountDao = ctx.getBean("acdao", AccountDao.class);
		int status = accountDao.addAccount();
		System.out.println(status);
		
		
	}

}
