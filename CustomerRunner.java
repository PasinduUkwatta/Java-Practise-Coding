package org.example;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer =new Customer("Pasindu",new Address("11/5,Pallidora Road","dehiwala","10350"));
        System.out.println(customer.toString());
    }
}
