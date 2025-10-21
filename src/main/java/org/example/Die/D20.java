package org.example.Die;

import java.util.Random;
import java.util.Scanner;

public class D20 {

    static Scanner input = new Scanner(System.in);
    static Random die = new Random();

    public static void dieRoll() throws InterruptedException {

//        Choices.timeToRoll();

        int roll = die.nextInt(20) + 1;
        System.out.println("It's " + roll);
    }
}