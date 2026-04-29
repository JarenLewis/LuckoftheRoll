package org.example;

import javax.management.ValueExp;

public class Coin extends RollableSides {

    public Coin() {
        super(2);
    }

    @Override
    public String sideValue(int value) {
        return (value == 1) ? "Heads" : "Tails";
    }

}