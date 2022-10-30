package com.company;

public class BankAccount {
    private int accNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        System.out.println("Empty Consturctor called");
    }

    public BankAccount(int accNumber,int balance,String customerName,String email,int phoneNumber){
        this.accNumber=accNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int depositMoney){
        this.balance =getBalance()+depositMoney;
        System.out.println("Your current balance after deposit is  :"+getBalance());

    }
    public void withdraw(int withdrawMoney){
        if(withdrawMoney<balance){
            this.balance=getBalance()-withdrawMoney;
            System.out.println("Your current after withdraw balance is :"+getBalance());
        }

        else {
            System.out.println("you dont have money to withdraw");
        }
    }



}
