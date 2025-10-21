package org.example;

import java.util.Random;
import java.util.Scanner;


public class Coin {

    static Scanner input = new Scanner(System.in);

    public static int coinFlip() throws InterruptedException {

        Random coinFace = new Random();
        int face = coinFace.nextInt(2);

        System.out.println("Then it's time to flip.");
        System.out.println("");
        Thread.sleep(800);

        coinInAir();

        System.out.println("");
        if (face == 0) {
            System.out.println("It's Heads");
        }
        else {
            System.out.println("It's Tails");
        }
        return face;
    }

    public static int coinChosen (int inputAnswer) throws InterruptedException {

        String answer = input.nextLine().toUpperCase();

        if (answer.contains("Y")) {
            System.out.println("Make your choice.");
            Thread.sleep(500);
            System.out.println("");
            System.out.println("[H]eads");
            System.out.println("[T]ails");

            String coinChoice = input.nextLine();

            if (coinChoice.equals("h")) {
                System.out.println("Your choice: Heads");
            }
            else if (coinChoice.equals("h")) {
                System.out.println("Your choice: Heads");
            }
            System.out.println("");
            Thread.sleep(1000);
            System.out.println("Time to flip.");
            System.out.println("");

            coinInAir();

            Random coinFace = new Random();
            int face = coinFace.nextInt(2);

            if (face == 0) {
                System.out.println("It's Heads");
            }
            else {
                System.out.println("It's Tails");
            }
        }
        else {
            Coin.coinFlip();
        }
        return inputAnswer;
    }

    public static void coinInAir() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            System.out.println("Heads");
            Thread.sleep(400);
            System.out.println("Tails");
            Thread.sleep(400);
        }
    }
}