package com.edu;

import org.junit.Test;
import org.testng.Assert;

public class CalculatorTest {

    @Test
    public void additionTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.addition(5, 5), 0);
    }
}
