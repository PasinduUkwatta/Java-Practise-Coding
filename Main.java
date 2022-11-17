package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer =new Customer("Tim",3456.345);
        Customer anotherCustomer;
        anotherCustomer =customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for Customer :"+customer.getBalance());
        System.out.println("Balance for Another Customer :"+anotherCustomer.getBalance());

        ArrayList<Integer> intList =new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(6);
        intList.add(8);

        for(int i=0;i<intList.size();i++){
            System.out.println(i +" : "+intList.get(i));
        }

        System.out.println("");
        intList.add(1,2);
        for(int i=0;i<intList.size();i++){
            System.out.println(i +" : "+intList.get(i));
        }
    }
}
