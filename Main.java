package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche =new Car();
        Car holden =new Car();
        BankAccount account =new BankAccount(132412,234535,"Pasindu","pasindu@gmail.com",0723452345);
        VIPCustomer customer1 =new VIPCustomer("Deshan",200.00);
        VIPCustomer customer2 =new VIPCustomer();

        porsche.setModel("Carrera");

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(1500);

        System.out.println(account);
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());

        System.out.println(porsche.getModel());
    }
}
