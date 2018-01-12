package edu.bsu.cs222;

public class LeapYearCalculator {

    public static final int FIRST_LEAP_YEAR = 1752;

    public boolean isLeapYear(int year) {
        if (year<FIRST_LEAP_YEAR) {
            throw new IllegalArgumentException("Cannot handle years before " + FIRST_LEAP_YEAR);
        }
        if (isDivisibleByFour(year)) {
            //noinspection SimplifiableIfStatement
            if (!isDivisibleByOneHundred(year)) {
               return true;
            }  else {
                return isDivisibleByFourHundred(year);
            }
        } else {
            return false;
        }
    }

    private boolean isDivisibleByFour(int year) {
        return new Number(year).isDivisibleBy(4);
    }

    private boolean isDivisibleByOneHundred(int year) {
        return new Number(year).isDivisibleBy(100);
    }

    private boolean isDivisibleByFourHundred(int year) {
        return new Number(year).isDivisibleBy(400);
    }
}
