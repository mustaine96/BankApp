package com.capgemini.bankapp.dummydatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class DummyDatabase {
	
	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date date = new Date();

	private static Set<Customer> customers =new HashSet<Customer>();
	private static Set<BankAccount> bankAccounts= new HashSet<>();
	
	
	BankAccount account1 = new BankAccount(1,"SavingsAccount", 25000);
	BankAccount account2= new BankAccount(2,"SalaryAccount", 12000);
	BankAccount account3= new BankAccount(3, "Disabled", 0);
	
	Customer customer1= new Customer(01, "Jimmi", "asdfg", "jimmi@gmail.com", "f4567 asdress street",df.format(date), account1);
	Customer customer2=new Customer(2, "gates", "asdf", "gates@gmail.com", "123 some street", df.format(date), account2);
	Customer customer3=new Customer(3, "no", "asd", "no@no.no", "no no noooo", df.format(date), account3);
	
	customer.add(account1);
	
	
	
	
	
	
	

}
