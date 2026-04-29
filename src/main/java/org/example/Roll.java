package org.example;

import java.util.Random;

public interface Roll {
    int sides();
    String sideValue(int value);
    int roll(Random toss);
}
