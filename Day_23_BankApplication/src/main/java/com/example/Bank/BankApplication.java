package com.example.Bank;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BankApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BankApplication.class, args);
		Customer customer1 = context.getBean(Customer.class);
		Customer customer2 = context.getBean(Customer.class);
		Fund_Transfer fundTransfer = context.getBean(Fund_Transfer.class);
		customer1.setCustomerName("Bhavya");
		customer1.setCustomerBranch("ABC");
		customer1.setMobileNumber(876549);
		customer1.setAccountNumber(908765);
		customer1.setAccountBalance(8000);
		customer1.showCustomerDetails();
		fundTransfer.transfer(500,customer1,"withdraw");
		customer2.setCustomerName("Sravani");
		customer2.setCustomerBranch("XYZ");
		customer2.setMobileNumber(87654);
		customer2.setAccountNumber(12008);
		customer2.setAccountBalance(6500);
		customer2.showCustomerDetails();

		fundTransfer.transfer(500,customer2,"deposit");
	}

}


//Create a Spring Boot application for ABC Bank.
//using this application,the customers of the bank should be able to access their
// account details and transfer funds to the other accounts of the same bank.
//This application should consist of the following entities:
//Customer: To store information about the customers of the bank
//Account:To store information about the existing accounts of the bank
//FundTransfer: To store information about the funds that are transferred from one account to the other.
//Create the application and inject dependencies in the entities.
