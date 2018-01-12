package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedLeapYearCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2016, true},
                {2015, false},
                {2000, true},
                {1900, false},
                {LeapYearCalculator.FIRST_LEAP_YEAR, true}
        });
    }

    @Parameterized.Parameter
    public int year;

    @Parameterized.Parameter(value = 1)
    public boolean expected;

    private LeapYearCalculator calc = new LeapYearCalculator();

    @Test
    public void testIsLeapYear() {
        boolean actual = calc.isLeapYear(year);
        Assert.assertEquals(expected,  actual);
    }
}
