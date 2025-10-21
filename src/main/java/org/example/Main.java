package org.example;

import org.example.Die.*;

import java.util.Random;
import java.util.Scanner;



import static org.example.souts.Choices.bestOutOf;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int round = 1;

        System.out.println("How many sides are required?");
        int inputAnswer = Integer.parseInt(input.nextLine());

        String verb = (inputAnswer == 2) ? "flip" : "roll";
        System.out.println("Do you want to choose a side before you " + verb + "? Y / N");
        String choiceAnswer = input.nextLine();


        if(choiceAnswer.equalsIgnoreCase("n")) {

            if (inputAnswer == 2) {
                Coin.coinFlip();
            } else if (inputAnswer == 4) {
                D4.dieRoll();
            } else if (inputAnswer == 6) {
                D6.dieRoll();
            } else if (inputAnswer == 8) {
                D8.dieRoll();
            } else if (inputAnswer == 10) {
                D10.dieRoll();
            } else if (inputAnswer == 12) {
                D12.dieRoll();
            } else if (inputAnswer == 20) {
                D20.dieRoll();
            }
        }
        else if (choiceAnswer.equalsIgnoreCase("y")) {
                if (inputAnswer == 2) {
                    Coin.coinFlip();
                } else if (inputAnswer == 4) {
                    D4.answerYes();
                } else if (inputAnswer == 6) {
                    D6.answerYes();
//            } else if (inputAnswer == 8) {
//                D8.dieRoll();
//            } else if (inputAnswer == 10) {
//                D10.dieRoll();
//            } else if (inputAnswer == 12) {
//                D12.dieRoll();
//            } else if (inputAnswer == 20) {
//                D20.dieRoll();
//            }
                }
            }


//        while (true) {
//           switch(inputAnswer) {
//               case 2: Coin.coinChosen(inputAnswer);
//                break;
//               case 4: D4.choiceRoll(true);
//           }
//
//            if(choiceAnswer.equalsIgnoreCase("y") && inputAnswer == 6) {
//                D6.yesChosenD6();
//            }



            Thread.sleep(700);
            System.out.println("Best " + bestOutOf(round) + "? (Y/N)");
            String nextRound = input.nextLine();

            if (nextRound.equalsIgnoreCase("N")) {
                System.out.println("Maybe next time");
//                break;
            } else {
                round++;
            }
        }
    }