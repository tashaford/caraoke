package com.example.natashaford.fruitmachine;

/**
 * Created by natashaford on 30/06/2017.
 */

public class Player {

    int money;
    int credit;

    public Player(int money){
        this.money = money;
        this.credit = 0;
    }

    public int getMoney(){
        return money;
    }

    public int getCredit(){
        return credit;
    }

    public int moneyToCredit(){
        credit = money * 2;
        return credit;
    }

    public void takeTurn(){
        credit = credit -1;
    }
}
