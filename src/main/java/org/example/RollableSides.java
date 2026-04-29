package org.example;

import java.util.Random;

abstract class RollableSides implements Roll{
    private final int sides;

    RollableSides(int sides) {
        this.sides = sides;
    }

    @Override
    public int sides() {
        return sides;
    }

    @Override
    public String sideValue(int value) {
        return String.valueOf(value);
    }

    @Override
    public int roll(Random toss) {
        return toss.nextInt(sides) + 1;
    }
}