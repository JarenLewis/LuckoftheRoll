package org.example;

import java.util.Random;
import java.util.Scanner;


public class Coin {

    static Scanner input = new Scanner(System.in);

    public static int coinFace() throws InterruptedException {

        Random coinFace = new Random();

        int face = coinFace.nextInt(2);

        System.out.println("Time to flip");
        Thread.sleep(800);
        System.out.println("Heads");
        Thread.sleep(400);
        System.out.println("Tails");
        Thread.sleep(400);
        System.out.println("Heads");
        Thread.sleep(400);
        System.out.println("Tails");
        Thread.sleep(400);
        System.out.println("Heads");
        Thread.sleep(400);
        System.out.println("Tails");
        Thread.sleep(400);
        System.out.println("Heads");
        Thread.sleep(400);
        System.out.println("Tails");
        Thread.sleep(400);
        System.out.println("Heads");
        Thread.sleep(400);
        System.out.println("Tails");
        Thread.sleep(400);
        System.out.println("Heads");






//        Thread.sleep(4000);
//        System.out.println("2");
//        Thread.sleep(4000);
//        System.out.println("1");
//        Thread.sleep(4000);

        if (face == 0) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

        return face;
    }

    public static int coinChosen (int inputAnswer) throws InterruptedException {
        System.out.println("We'll use a coin");

        Thread.sleep(800);

        System.out.println("");
        System.out.println("Do you want to choose the side of the coin? Y / N");
        String answer = input.nextLine().toUpperCase();

        if (answer.contains("Y")) {
            System.out.println("Make your choice.");

            Thread.sleep(800);

            System.out.println("");
            System.out.println("[H]eads");
            System.out.println("[T]ails");


        }
        else {
            Coin.coinFace();
        }
        return inputAnswer;
    }
}
