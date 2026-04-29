package org.example;

class Die extends RollableSides {
    public Die(int sides) {
        super(sides);

        if (sides < 2) {
            throw new IllegalArgumentException("Choose a number 2 and above.");
        }
    }

}