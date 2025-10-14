package org.example;

import java.util.Random;

public class Coin {

    public static int coinFace() {

        Random coinFace = new Random();
        int face = coinFace.nextInt(2);

        System.out.println(face);

        return face;
    }

}