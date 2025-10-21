package org.example.Die;

import org.example.souts.Choices;

import java.util.Random;
import java.util.Scanner;

public class D12 {

    static Scanner input = new Scanner(System.in);
    static Random die = new Random();

    public static void dieRoll() throws InterruptedException {

//        Choices.timeToRoll();

        int roll = die.nextInt(12) + 1;
        System.out.println("It's " + roll);
    }

    public static void answerYes() throws InterruptedException {
        System.out.println("Choose between: ");
        Choices.sidesChoiceD12();

        String sideChoice = input.nextLine();
        int choice = Integer.parseInt(sideChoice);

        if(choice > 1 && choice <= 12) {
            System.out.println("Your choice: " + sideChoice);
        }
        else {
            System.out.println("I'll get to you dont you worry");
        }

        dieRoll();
    }
}