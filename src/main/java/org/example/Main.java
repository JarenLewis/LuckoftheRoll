package org.example;

import java.util.Random;
import java.util.Scanner;



//change the choices to the first letter. The numbers are confusing you.

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many sides do you need?");
        String answer = input.nextLine();
        int inputAnswer = Integer.parseInt(answer);

        System.out.println("Do you want to choose the side of the coin? Yes[1] No[2]");
        answer = input.nextLine();
        int coinChoice = Integer.parseInt(answer);


        int faceAnswer = 0;
        if (coinChoice == 1) {
            System.out.println("Heads[1] or Tails[2]?");
            answer = input.nextLine();
            faceAnswer = Integer.parseInt(answer);
//            if (faceAnswer == Coin.coinFace())
        }

        if (faceAnswer == 2) {
            Coin.coinFace();
            System.out.println("It was");
        }
        
        ;


//            if (faceAnswer == 1 || faceAnswer == 2){


//
//        if (inputAnswer == 2) {
//            System.out.println("Flip");
//            answer = input.nextLine();
//            int flip = Integer.parseInt(answer);
//
//           Coin.coinFace(flip);


//            int face = coinFace.nextInt(2);
//
//            System.out.println("Choose Heads or Tails: ");
//            String coinChoice = input.nextLine();
//            System.out.println("Choice: " + coinChoice);
//
//            int chosenFace = Integer.parseInt(coinChoice);
//
//
//            }

    }




    }
