package com.example.natashaford.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

import Behaviours.Symbol;

/**
 * Created by natashaford on 30/06/2017.
 */

public class Reel {

    int index;

    private ArrayList<Symbol> reelList;

    public Reel() {
        reelList = new ArrayList<Symbol>();
        this.index = 0;
    }

    public int getReelListSize() {
        return reelList.size();
    }

    public void createReelList() {
        for (Symbol symbol : Symbol.values()) {
            reelList.add(symbol);
        }
    }

    public int getIndex(){
        return this.index;
    }

    public void setIndex(){
        getRandomIndex();
    }

    public void getRandomIndex() {
        Random rand = new Random();
        this.index = rand.nextInt(6);
    }


    public String getRandomSymbol() {
        return reelList.get(this.index).getValue();
    }

}
