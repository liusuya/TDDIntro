package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by Suya on 2016-07-31.
 */
public class Account {
    private int balance;

    public Account(int amount){
        balance = amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount)
            balance -= amount;
    }

    public int retrieveBalance() {
        return balance;
    }
}
