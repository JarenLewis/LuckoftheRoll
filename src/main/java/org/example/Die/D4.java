package org.example.Die;

import org.example.souts.Choices;
import java.util.Random;
import java.util.Scanner;

public class D4 {

    private static Scanner input = new Scanner(System.in);
    private static Random die = new Random();

    public static void answerYes() throws InterruptedException {
        System.out.println("Choose between: ");
        Choices.sidesChoiceD4();

        String sideChoice = input.nextLine();

        if(sideChoice.matches("[1-4]")) {
            System.out.println("Your choice: " + sideChoice);
        }
        else {
            System.out.println("I'll get to you dont you worry");
        }

        System.out.println("");
    }

    public static void dieRoll() throws InterruptedException {

//        Choices.timeToRoll();

        int roll = die.nextInt(4) + 1;
        System.out.println("It's " + roll);
    }
}