package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random die = new Random();

        while (true) {
            while (true) {
                System.out.println("How many sides are required?");
                int numberOfSides = Integer.parseInt(input.nextLine().trim());

                if (numberOfSides < 2) {
                    System.out.println("Choose 2 or more sides.");
                    continue;
                }

                String yesOrNo = (numberOfSides == 2) ? "flip" : "roll";
                System.out.println("Do you want to choose a side before you " + yesOrNo + "? Y / N");
                String choiceAnswer = input.nextLine().trim();

                if (numberOfSides != 2) {
                    if (choiceAnswer.equalsIgnoreCase("n")) {
                        int roll = die.nextInt(numberOfSides) + 1;
                        System.out.println("It's " + roll);
                    }
                    if (choiceAnswer.equalsIgnoreCase("y")) {
                        System.out.println("Choose a number between 1 and " + numberOfSides + ".");
                        int chosenNumber = Integer.parseInt(input.nextLine().trim());
                        System.out.println("Your choice: " + chosenNumber);
                        int roll = die.nextInt(numberOfSides) + 1;
                        System.out.println("It's " + roll);
                    }
                }
                if (numberOfSides == 2) {
                    if (choiceAnswer.equalsIgnoreCase("n")) {
                        int flip = die.nextInt(numberOfSides);

                        if (flip == 0) {
                            System.out.println("It's Heads");
                        } else {
                            System.out.println("It's Tails");
                        }
                    }
                    if (choiceAnswer.equalsIgnoreCase("y")) {
                        System.out.println("Choose between [H]eads or [T]ails.");
                        String chosenFace = input.nextLine().trim();

                        if (chosenFace.equalsIgnoreCase("h")) {
                            System.out.println("Your choice: Heads");
                        } else if (chosenFace.equalsIgnoreCase("t")) {
                            System.out.println("Your choice: Tails");
                        }

                        int flip = die.nextInt(numberOfSides);

                        if (flip == 0) {
                            System.out.println("It's Heads");
                        } else {
                            System.out.println("It's Tails");
                        }
                    }
                }
                while (true) {
                    System.out.println();
                    System.out.println("Go again? Y/N");
                    String goAgain = input.nextLine().trim();

                    if (goAgain.equalsIgnoreCase("y")) {
                        break;
                    }
                    if (goAgain.equalsIgnoreCase("n")) {
                        System.out.println("Maybe next time");
                        return;
                    } else if (!goAgain.equalsIgnoreCase("y")) {
                        System.out.println("Choose between either Y or N.");
                    }
                }
            }
        }
    }
}