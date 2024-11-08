package com.aspectoriented.aspectoriented.dao;

import com.aspectoriented.aspectoriented.Account;

public interface AccountDAO {
    void addAccount(Account account,boolean vipFlag);
    boolean doWork();
}
