package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by Suya on 2016-07-31.
 */
public class Account {
    public int balance;


    public int deposit(int i) {
        balance += i;
        return balance;
    }

    public int withdraw(int i) {

        if (balance >= i)
            balance -= i;
        return balance;
    }
}
