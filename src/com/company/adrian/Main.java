package com.company.adrian;

public class Main {

    public static void main(String[] args) {
	Account bobAccount = new Account();
/* setting Value for Account properties */
	bobAccount.setNumber("12 2811956");
	bobAccount.setBalance(120.00);
	bobAccount.setCustomerName("Bob Brown");
	bobAccount.setCustomerEmailAdress("myemail@bob.com");
	bobAccount.setCustomerPhoneNumber("660 000 000");

	bobAccount.deposit(50);
	bobAccount.withdrawal(100);
	bobAccount.deposit(51);
	bobAccount.withdrawal(100);

	VipCustomer person1 = new VipCustomer();
	System.out.println(person1.getName());

	VipCustomer person2 = new VipCustomer("Bob",25000);
	System.out.println(person2.getName());

	VipCustomer person3 = new VipCustomer("Alex",26000,"default@gmail.com");
	System.out.println(person3.getName());
    }
}
