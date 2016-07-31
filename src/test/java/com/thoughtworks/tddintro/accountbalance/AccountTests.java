package com.thoughtworks.tddintro.accountbalance;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    public Account account;

    @Before
    public void setUp() {
        account = new Account();
    }
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposit(100);
        assertThat(account.deposit(50), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.deposit(100);
        assertThat(account.withdraw(50), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        assertThat((account.withdraw(100)), is(50));
    }
}
