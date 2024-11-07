package com.aspectoriented.aspectoriented.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() +"  :  addAccount  "+ "doing my db work to add account");

    }
}
