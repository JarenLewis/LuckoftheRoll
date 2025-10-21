package org.example.Die;

import org.example.souts.Choices;
import java.util.Random;
import java.util.Scanner;

public class D8 {

    static Scanner input = new Scanner(System.in);
    static Random die = new Random();
    static int side = die.nextInt(6);

    public static void dieRoll() throws InterruptedException {

//        Choices.timeToRoll();

        int roll = die.nextInt(8) + 1;
        System.out.println("It's " + roll);
    }

//    public static void yesChosenD8() throws InterruptedException {
//        Choices.sidesChoiceD8();
//
//        String sideChoice = input.nextLine();
//
//        if (sideChoice.equals("1")) {
//            System.out.println("Your choice: 1");
//        } else if (sideChoice.equals("2")) {
//            System.out.println("Your choice: 2");
//        } else if (sideChoice.equals("3")) {
//            System.out.println("Your choice: 3");
//        } else if (sideChoice.equals("4")) {
//            System.out.println("Your choice: 4");
//        } else if (sideChoice.equals("5")) {
//            System.out.println("Your choice: 5");
//        } else if (sideChoice.equals("6")) {
//            System.out.println("Your choice: 6");
//        }
//        System.out.println("");
//    }
//
//    public static void chosen() throws InterruptedException {
//
//        Choices.timeToRoll();
//
//        if (side == 0) {
//            System.out.println("It's 1");
//        } else if (side == 1) {
//            System.out.println("It's 2");
//        } else if (side == 2) {
//            System.out.println("It's 3");
//        } else if (side == 3) {
//            System.out.println("It's 4");
//        } else if (side == 4) {
//            System.out.println("It's 2");
//        } else
//            System.out.println("It's 3");
//    }
}