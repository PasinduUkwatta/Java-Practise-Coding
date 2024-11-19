package com.aspectoriented.aspectoriented;

import com.aspectoriented.aspectoriented.dao.AccountDAO;
import com.aspectoriented.aspectoriented.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.transform.sax.SAXResult;

@SpringBootApplication
public class AspectorientedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectorientedApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO) {
		return runner->{
			System.out.println("Hello World");
			demoBeforeAdvice(accountDAO,membershipDAO);
		};
	}

	private void demoBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
		Account account = new Account();
		accountDAO.addAccount(account,true);
		accountDAO.doWork();

		membershipDAO.addSillyAccount();
		membershipDAO.goToSleep();
	}

}
