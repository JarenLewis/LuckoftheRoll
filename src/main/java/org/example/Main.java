package org.example;

import java.util.Random;
import java.util.Scanner;



//change the choices to the first letter. The numbers are confusing you.

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("How many sides are required?");
        String answer = input.nextLine();
        int inputAnswer = Integer.parseInt(answer);

        if (inputAnswer == 2) {
            Coin.coinChosen(inputAnswer);
        }
//        else if (inputAnswer == 6)
    }
}

