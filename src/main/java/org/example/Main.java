package org.example;

import java.util.Random;
import java.util.Scanner;

import static org.example.Coin.bestOutOf;


//change the choices to the first letter. The numbers are confusing you.

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int round = 1;

        System.out.println("How many sides are required?");
        String answer = input.nextLine();
        int inputAnswer = Integer.parseInt(answer);

        while (true) {
            if (inputAnswer == 2) {
                Coin.coinChosen(inputAnswer);
            }
            else if (inputAnswer == 6) {

            }

            System.out.println("Best " + bestOutOf(round) + "? (Y/N)");
            String nextRound = input.nextLine();


            if (nextRound.equalsIgnoreCase("N")){
                System.out.println("Maybe next time");
                break;
            }

            System.out.println(bestOutOf(round));
            round++;
        }





//        else if (inputAnswer == 6)
    }
}

