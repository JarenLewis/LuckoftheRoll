package org.example.souts;

public class Choices {

    public static void sidesChoiceD4() throws InterruptedException {
        System.out.println("[1]");
        System.out.println("[2]");
        System.out.println("[3]");
        System.out.println("[4]");
    }

    public static void sidesChoiceD6() throws InterruptedException {
        sidesChoiceD4();
        System.out.println("[5]");
        System.out.println("[6]");
    }

    public static void sidesChoiceD8() throws InterruptedException {
        sidesChoiceD6();
        System.out.println("[7]");
        System.out.println("[8]");
    }

    public static void sidesChoiceD10() throws InterruptedException {
        sidesChoiceD8();
        System.out.println("[9]");
        System.out.println("[10]");
    }

    public static void sidesChoiceD12() throws InterruptedException {
        sidesChoiceD10();
        System.out.println("[11]");
        System.out.println("[12]");
    }

    public static void sidesChoiceD20() throws InterruptedException {
        sidesChoiceD12();
        System.out.println("[13]");
        System.out.println("[14]");
        System.out.println("[15]");
        System.out.println("[16]");
        System.out.println("[17]");
        System.out.println("[18]");
        System.out.println("[19]");
        System.out.println("[20]");
    }

    public static void timeToRoll() throws InterruptedException {
//        System.out.println("Roll the die.");
        Thread.sleep(800);
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
    }
    public static String bestOutOf(int round) {

        int bets = round + 1;
        int wins = (bets * 2) - 1;

        String betSeries = bets + " out of " + wins;
        return betSeries;
    }
}