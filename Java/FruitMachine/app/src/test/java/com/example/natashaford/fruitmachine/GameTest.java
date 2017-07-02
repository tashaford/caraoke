package com.example.natashaford.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by natashaford on 30/06/2017.
 */

public class GameTest {

    Game game;
    Ui ui;
    Player player;
    Reel reel1;
    Reel reel2;
    Reel reel3;
    private Scanner sc;
    Reel spyReel1;
    Reel spyReel2;
    Reel spyReel3;


    @Before
    public void before() {
        game = new Game();
        ui = new Ui();
        player = new Player(1);
        reel1 = new Reel();
        reel2 = new Reel();
        reel3 = new Reel();
        sc = new Scanner(System.in);
        spyReel1 = Mockito.spy(reel1);
        spyReel2 = Mockito.spy(reel2);
        spyReel3 = Mockito.spy(reel3);
    }

//    @Test
//    public void testPullLever() throws Exception {
//        assertEquals();
//    }

//
//    @Test
//    public void testSpinReels() throws Exception {
//        Mockito.when(spyReel1.getRandomSymbol()).thenReturn("Bar");
//        Mockito.when(spyReel2.getRandomSymbol()).thenReturn("Bar");
//        Mockito.when(spyReel3.getRandomSymbol()).thenReturn("Bar");
//        game.pullLever();
//        String result = game.spinReels();
//        assertEquals("Bar, Bar, Bar", result);
//    }

//    @Test
//    public void testCreditSetUp() throws Exception {
//        assertEquals();
//    }

//    @Test
//    public void testCheckWinOrLose() throws Exception {
//        assertEquals();
//    }

//    @Test
//    public void testTotalWinnings() throws Exception {
//
//
//        assertEquals("You have won £15", );
//    }
}
