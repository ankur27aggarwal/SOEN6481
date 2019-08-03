package com.company;

import org.junit.Assert;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void calculations() {

        Main calc = new Main();
        Assert.assertTrue(calc.calculations("1", 3.0D, 7.0D) == 10.0D);
        Assert.assertTrue(calc.calculations("2", 8.0D, 7.0D) == 1.0D);
        Assert.assertTrue(calc.calculations("3", 6.0D, 3.0D) == 2.0D);
        Assert.assertTrue(calc.calculations("4", 9.0D, 8.0D) == 72.0D);
        Assert.assertTrue(calc.calculations("1", 15.0D, -25.0D) == -10.0D);
        Assert.assertTrue(calc.calculations("2", 67.0D, 45.0D) == 22.0D);
        Assert.assertTrue(calc.calculations("3", 98.0D, 56.0D) == 1.75D);
        Assert.assertTrue(calc.calculations("4", 9.0D, 8.0D) == 72.0D);




    }
}