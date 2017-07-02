package com.example.natashaford.fruitmachine;

/**
 * Created by natashaford on 30/06/2017.
 */

public class Bank {

    int bankCredit;

    public Bank(int bankCredit){
        this.bankCredit = bankCredit;
    }

    public int getCredit() {
        return bankCredit;
    }

    public void addToBank(int playerCredit) {
        bankCredit = bankCredit + playerCredit;
    }
}
