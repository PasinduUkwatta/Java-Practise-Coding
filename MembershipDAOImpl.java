package com.aspectoriented.aspectoriented.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public boolean addSillyAccount() {
        System.out.println(getClass() +"  :  addAccount  "+ "doing my db work to add membership account");
        return true;

    }

    @Override
    public boolean goToSleep() {
        System.out.println(getClass() +"  :  addAccount  "+ "doing my db work to add membership account");
        return true;

    }
}
