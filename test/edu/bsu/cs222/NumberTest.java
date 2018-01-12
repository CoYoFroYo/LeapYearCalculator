package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {

    @Test
    public void test4IsDivisibleBy1() {
        Number number = new Number(4);
        Assert.assertTrue(number.isDivisibleBy(1));
    }

    @Test
    public void test2000IsDivisibleBy4() {
        Number number = new Number(2000);
        Assert.assertTrue(number.isDivisibleBy(4));
    }

    @Test
    public void test1900IsNotDivisibleBy400() {
        Number number = new Number(1900);
        Assert.assertFalse(number.isDivisibleBy(400));
    }
}
