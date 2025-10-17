package org.example;

import org.example.Die.D4;
import org.example.Die.D6;

import java.util.Random;
import java.util.Scanner;


//ask if they way to choose a side after askinhg how many sides are required so you dont have to keep answering if you want to or not.


import static org.example.souts.Dialogue.bestOutOf;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int round = 1;

        System.out.println("How many sides are required?");
        int inputAnswer = Integer.parseInt(input.nextLine());

        String verb = (inputAnswer == 2) ? "flip" : "roll";
        System.out.println("Do you want to choose a side before you " + verb + "? Y / N");
        String choiceAnswer = input.nextLine();


        while (true) {
           switch(inputAnswer) {
               case 2: Coin.coinChosen(inputAnswer);
                break;
               case 4: D4.choiceRoll();
           }

            if(choiceAnswer.equalsIgnoreCase("y") && inputAnswer == 6) {
                D6.yesChosenD6();
            }

            D6.chosenD6();

            Thread.sleep(700);
            System.out.println("Best " + bestOutOf(round) + "? (Y/N)");
            String nextRound = input.nextLine();

            if (nextRound.equalsIgnoreCase("N")) {
                System.out.println("Maybe next time");
                break;
            } else {
                round++;
            }
        }
    }
}