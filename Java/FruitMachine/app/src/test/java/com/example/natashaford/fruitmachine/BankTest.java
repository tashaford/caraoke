package com.example.natashaford.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by natashaford on 30/06/2017.
 */

public class BankTest {

    Bank bank;

    @Before
    public void before(){
        bank = new Bank(20);
    }

    @Test
    public void testGetCredit() throws Exception {
        assertEquals(20, bank.getCredit());
    }

    @Test
    public void testAddToBank() throws Exception {
        bank.addToBank(1);
        assertEquals(21, bank.getCredit());
    }
}
