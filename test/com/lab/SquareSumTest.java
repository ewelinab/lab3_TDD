package com.lab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ewna on 2015-05-31.
 */
public class SquareSumTest {
    @Test
    public void calculateSumSquareDiffTest() {
        assertEquals(70, SquareSum.calculateSumSquareDiff(4));
        assertEquals(2640, SquareSum.calculateSumSquareDiff(10));
    }

    @Test
    public void calculateSumOfTheSquaresTest() {
        assertEquals(30, SquareSum.calculateSumOfTheSquares(4));
        assertEquals(385, SquareSum.calculateSumOfTheSquares(10));
    }

    @Test
    public void calculateSquareOfTheSumTest() {
        assertEquals(100, SquareSum.calculateSquareOfTheSum(4));
        assertEquals(3025, SquareSum.calculateSquareOfTheSum(10));
    }
}