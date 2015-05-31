package com.lab;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by ewna on 2015-05-31.
 */
public class SquareSum {

    public static int calculateSumSquareDiff(int n) {
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
