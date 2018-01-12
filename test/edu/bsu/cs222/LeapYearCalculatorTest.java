package edu.bsu.cs222;

import org.junit.Test;

public class LeapYearCalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTheYearBeforeTheFirstLeapYearThrowsException() {
        LeapYearCalculator calc = new LeapYearCalculator();
        calc.isLeapYear(LeapYearCalculator.FIRST_LEAP_YEAR-1);
    }

}
