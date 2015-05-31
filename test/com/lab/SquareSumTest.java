package com.lab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ewna on 2015-05-31.
 */
public class SquareSumTest {
    @Test
    public void calculateSumSquareDiffTest() {
        // standard case
        assertEquals(70, SquareSum.calculateSumSquareDiff(4));
        assertEquals(2640, SquareSum.calculateSumSquareDiff(10));

        // boundary cases
        assertEquals(0, SquareSum.calculateSumSquareDiff(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSumSquareDiffNegativeTest() {
        assertEquals(0, SquareSum.calculateSumSquareDiff(-5));
    }

    @Test
    public void calculateSumOfTheSquaresTest() {
        assertEquals(30, SquareSum.calculateSumOfTheSquares(4));
        assertEquals(385, SquareSum.calculateSumOfTheSquares(10));

        // boundary cases
        assertEquals(0, SquareSum.calculateSumOfTheSquares(0));
    }

    @Test
    public void calculateSquareOfTheSumTest() {
        assertEquals(100, SquareSum.calculateSquareOfTheSum(4));
        assertEquals(3025, SquareSum.calculateSquareOfTheSum(10));

        // boundary cases
        assertEquals(0, SquareSum.calculateSquareOfTheSum(0));
    }
}