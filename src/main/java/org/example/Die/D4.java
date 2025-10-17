package org.example.Die;

import org.example.souts.Choices;
import java.util.Random;
import java.util.Scanner;

public class D4 {

    private static Scanner input = new Scanner(System.in);
    private static Random die = new Random();

    public static void choiceRoll(boolean chooseSide) throws InterruptedException {

            if (chooseSide) {


            String sideChoice = input.nextLine();

            if (sideChoice.equals("1")) {
                System.out.println("Your choice: 1");
            } else if (sideChoice.equals("2")) {
                System.out.println("Your choice: 2");
            } else if (sideChoice.equals("3")) {
                System.out.println("Your choice: 3");
            } else if (sideChoice.equals("4")) {
                System.out.println("Your choice: 4");
            }
            System.out.println("");
            D4.dieRoll();

        } else {
            D4.dieRoll();
        }
    }

    public static int dieRoll() throws InterruptedException {


        int side = die.nextInt(4);

        Choices.timeToRoll();

        System.out.println("");
        if (side == 0) {
            System.out.println("It's 1");
        }
        else if (side == 1) {
            System.out.println("It's 2");
        }
        else if (side == 2) {
            System.out.println("It's 3");
        }
        else {
            System.out.println("It's 4");
        }
        return side;
    }
}