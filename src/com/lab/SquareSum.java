package com.lab;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by ewna on 2015-05-31.
 */
public class SquareSum {
    /**
     * Calculates the difference between the square of the sum and the sum of the squares for first n natural numbers.
     * <p>
     * The sum of the squares of the n natural numbers is,
     * 1^2 + 2^2 + ... + n^2 = sum1
     * <p>
     * The square of the sum of the n natural numbers is,
     * (1 + 2 + ... + n)^2 = sum2
     * <p>
     * Difference between the sum of the squares of n natural numbers and the square of the sum is sum2 - sum1.
     * <p>
     * Examples:
     * calculateSumSquareDiff(4) -> 70
     * calculateSumSquareDiff(10) -> 2640
     *
     * @param n - length of sequence
     * @return difference of "square of the sum" and "sum of the squares"
     */
    public static int calculateSumSquareDiff(int n) {
        if(n < 0)
            throw new IllegalArgumentException("n must be positive number");
        return calculateSquareOfTheSum(n) - calculateSumOfTheSquares(n);
    }

    public static int calculateSquareOfTheSum(int n){
        int squareOfTheSum = 0;
        for (int i = 1; i <= n; ++i) {
            squareOfTheSum += i;
        }
        squareOfTheSum *= squareOfTheSum;
        return squareOfTheSum;
    }

    public static int calculateSumOfTheSquares(int n){
        int sumOfTheSquares = 0;
        for (int i = 1; i <= n; ++i) {
            sumOfTheSquares += (i * i);
        }
        return sumOfTheSquares;
    }
}
