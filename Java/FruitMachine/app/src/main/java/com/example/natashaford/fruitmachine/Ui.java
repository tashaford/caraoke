package com.example.natashaford.fruitmachine;

/**
 * Created by natashaford on 30/06/2017.
 */

public class Ui {

    public Ui(){
    }

    public void welcome(){
        System.out.println("Let's play!");
        System.out.println();
    }

    public void credit(){
        System.out.println("Your credit is: ");
    }

    public void displayRules(){
        System.out.println("The rules are simple. You need to match three items from a spin to win money.");
        System.out.println("If you get:");
        System.out.println("            three cherries you win £2,");
        System.out.println("            three bars you win £3,");
        System.out.println("            three watermelons you win £4,");
        System.out.println("            three lemons you win £5,");
        System.out.println("            three plums you win £10,");
        System.out.println("            three oranges you win £15,");
        System.out.println("            and three 7's you win £20!!");
        System.out.println();
    }

    public void start(){
        System.out.println();
        System.out.println("Would you like to pull the lever, y/n?");
    }

    public void presentResultOfSpin(){
        System.out.println();
        System.out.println("You spun :");
    }

    public void winMessage(){
        System.out.println("Congratulations you got three matches!");
        System.out.println("You have won: ");
    }

    public void loseMessage(){
        System.out.println();
        System.out.println("Sorry, you didn't get three matches this time.");
    }

    public void takeAnotherTurn(){
        System.out.println();
        System.out.println("Would you like to try again, y/n?");
    }

    public void bye(){
        System.out.println();
        System.out.println("Okay, goodbye!");
    }

    public void endBye(){
        System.out.println();
        System.out.println("Would you like to play again? Add more credit, y/n?");
    }

    public void newGame(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
