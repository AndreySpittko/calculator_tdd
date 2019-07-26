package com.edu;

import org.junit.Test;
import org.testng.Assert;

public class CalculatorTest {

    @Test
    public void additionTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(10, calculator.addition(5, 5), 0);
    }

    @Test
    public void subtractionTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(20, calculator.subtraction(50, 30), 0);
    }

    @Test
    public void multiplicationTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(45, calculator.multiplication(5, 9), 0);
    }
}
