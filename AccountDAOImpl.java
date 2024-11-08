package com.aspectoriented.aspectoriented.dao;

import com.aspectoriented.aspectoriented.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {


    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + "  :  addAccount  " + "doing my db work to add account");

    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + "  :  dowork  " + "doing my db work to do work");

        return false;
    }
}
