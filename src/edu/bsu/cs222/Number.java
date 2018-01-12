package edu.bsu.cs222;

public class Number {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public boolean isDivisibleBy(int i) {
        return number % i == 0;
    }
}
