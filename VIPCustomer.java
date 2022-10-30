package com.company;

public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer() {
        this("Pasindu",10000.00,"Pasindu@gmail.com");
    }

    public VIPCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }





}
