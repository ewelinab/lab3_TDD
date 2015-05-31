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
        throw new NotImplementedException();
    }

    public static int calculateSumOfTheSquares(int n){
        throw new NotImplementedException();
    }
}
