package org.example.Die;

import org.example.souts.Choices;
import java.util.Random;
import java.util.Scanner;

public class D6 {

    static Scanner input = new Scanner(System.in);
    static Random die = new Random();

    public static void yesChosenD6() throws InterruptedException {
        System.out.println("Choose between: ");
        System.out.println("[1]");
        System.out.println("[2]");
        System.out.println("[3]");
        System.out.println("[4]");
        System.out.println("[5]");
        System.out.println("[6]");

        String sideChoice = input.nextLine();

        if(sideChoice.matches("[1-6]")) {
            System.out.println("Your choice: " + sideChoice);
        }
        else {
            System.out.println("I'll get to you dont you worry");
        }

        System.out.println("");
    }

    public static void chosenD6() throws InterruptedException {

        Choices.timeToRoll();

        int roll = die.nextInt(6) + 1;
        System.out.println("It's " + roll);
        }
}