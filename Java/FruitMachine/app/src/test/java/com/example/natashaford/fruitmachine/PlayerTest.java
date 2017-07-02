package com.example.natashaford.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by natashaford on 30/06/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player(1);
    }

    @Test
    public void testGetMoney() throws Exception {
        assertEquals(1, player.getMoney());
    }

    @Test
    public void testGetCredit() throws Exception {
        assertEquals(0, player.getCredit());
    }

    @Test
    public void testMoneyToCredit() throws Exception {
        player.moneyToCredit();
        assertEquals(2, player.getCredit());
    }

    @Test
    public void testTakeTurn() throws Exception {
        player.moneyToCredit();
        player.getCredit();
        player.takeTurn();
        assertEquals(1, player.getCredit());
    }
}
