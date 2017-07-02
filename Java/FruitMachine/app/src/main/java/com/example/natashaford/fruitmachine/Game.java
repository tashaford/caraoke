package com.example.natashaford.fruitmachine;

import java.util.Scanner;

import Behaviours.Symbol;

/**
 * Created by natashaford on 30/06/2017.
 */

public class Game {

    Ui ui;
    Player player;
    Reel reel1;
    Reel reel2;
    Reel reel3;
    private Scanner sc;

    public Game() {
        ui = new Ui();
        player = new Player(1);
        reel1 = new Reel();
        reel2 = new Reel();
        reel3 = new Reel();
        sc = new Scanner(System.in);
    }

    public void runGame() {
        ui.welcome();
        ui.displayRules();
        creditSetUp();
        ui.start();
        pullLever();
        checkWinOrLose();
        pullLever();
        checkWinOrLose();
        playAgain();
        ui.newGame();
    }

    public void pullLever() {
        char input = sc.nextLine().charAt(0);
        if (input == 'y') {
            ui.presentResultOfSpin();
            System.out.println(spinReels());
            player.takeTurn();
        } else {
            ui.bye();
        }
    }

    public String spinReels() {
        reel1.createReelList();
        reel2.createReelList();
        reel3.createReelList();
        reel1.setIndex();
        reel2.setIndex();
        reel3.setIndex();
        return reel1.getRandomSymbol() + ", " + reel2.getRandomSymbol() + ", " + reel3.getRandomSymbol();
    }

    public void creditSetUp() {
        player.moneyToCredit();
        ui.credit();
        System.out.println(player.getCredit());
    }

    public void checkWinOrLose() {
        if ((reel1.getRandomSymbol() == reel2.getRandomSymbol()) && (reel1.getRandomSymbol() == reel3.getRandomSymbol())) {
            ui.winMessage();
            totalWinnings();
            player.takeTurn();
            ui.bye();
        } else {
            ui.loseMessage();
            ui.credit();
            System.out.println(player.getCredit());
            if (player.getCredit() == 0) {
                ui.endBye();
            } else {
                ui.takeAnotherTurn();
            }
        }
    }

    public void totalWinnings() {
        int i = 0;
        if (reel1.getRandomSymbol() == "Cherry") i = 1;
        if (reel1.getRandomSymbol() == "Bar") i = 2;
        if (reel1.getRandomSymbol() == "Watermelon") i = 3;
        if (reel1.getRandomSymbol() == "Lemon") i = 4;
        if (reel1.getRandomSymbol() == "Plum") i = 5;
        if (reel1.getRandomSymbol() == "Orange") i = 6;
        if (reel1.getRandomSymbol() == "Seven") i = 7;
        switch (i) {
            case 1:
                System.out.println("£2");
            case 2:
                System.out.println("£3");
            case 3:
                System.out.println("£4");
            case 4:
                System.out.println("£5");
            case 5:
                System.out.println("£10");
            case 6:
                System.out.println("£15");
            case 7:
                System.out.println("£20");
            default:
                System.out.println("See above");
        }
    }

    public void playAgain() {
        char input = sc.nextLine().charAt(0);
        if (input == 'y') {
            runGame();
        } else {
            ui.bye();
        }
    }
}