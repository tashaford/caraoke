package com.example.natashaford.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Behaviours.Symbol;

import static junit.framework.Assert.assertEquals;

/**
 * Created by natashaford on 30/06/2017.
 */

public class ReelTest {

    Reel reel;
    Reel spyReel;
    Symbol symbol;

    @Before
    public void before(){
        reel = new Reel();
        spyReel = Mockito.spy(reel);
    }

    @Test
    public void testGetReelListSize() throws Exception {
        assertEquals(0, reel.getReelListSize());
    }

    @Test
    public void testCreateReelList() throws Exception {
        reel.createReelList();
        assertEquals(7, reel.getReelListSize());
    }

    @Test
    public void testGetIndex(){
        assertEquals(0, reel.getIndex());
    }

//    @Test
//    public void testGetRandomSymbolIndex() throws Exception {
//        Mockito.when(spyReel.getRandomSymbolIndex()).thenReturn(4);
//        int result = spyReel.getIndex();
//        assertEquals(4, result);
//    }

    @Test
    public void testGetSymbol() throws Exception {
        spyReel.createReelList();
        Mockito.when(spyReel.getRandomSymbol()).thenReturn("cherry");
        String result = spyReel.getRandomSymbol();
        assertEquals("cherry", result);
    }

}
