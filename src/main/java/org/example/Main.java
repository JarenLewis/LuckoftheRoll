package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random toss = new Random();

        while (true) {
            int sides = displayNumberChoice(userInput, "How many sides are needed?", 2);

            Roll coinOrDie = (sides == 2) ? new Coin() : new Die(sides);

            int result = coinOrDie.roll(toss);
            System.out.println("It's " + coinOrDie.sideValue(result));

            if (!displayYesNo(userInput, "Go again? Y/N")) {
                System.out.println("Maybe next time.");
                break;
            }
        }
    }

    private static int displayNumberChoice(Scanner userInput, String prompt, int minimum) {
        while(true) {
            System.out.println(prompt);

            try {
                int input = Integer.parseInt(userInput.nextLine().trim());

                if (input >= minimum) {
                    return input;
                }
                System.out.println("Choose " + minimum + " or more.");
            }
            catch (NumberFormatException e) {
                System.out.println("Please Enter a whole number.");
            }
        }
    }


    private static boolean displayYesNo(Scanner in, String yesOrNo){
        while (true) {
            System.out.println(yesOrNo);
            String input = in.nextLine().trim();

            if (input.equalsIgnoreCase("y")) {
                return true;
            }
            if (input.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Choose between Y/N");
        }
    }
}