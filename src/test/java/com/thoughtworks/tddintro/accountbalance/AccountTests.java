package com.thoughtworks.tddintro.accountbalance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        account.deposit(100);
        assertThat(account.deposit(50), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account();
        assertThat(new Account().withdraw(50), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account();
        assertThat((new Account().withdraw(100)), is(50));
    }
}
