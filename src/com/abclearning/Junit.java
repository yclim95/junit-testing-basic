package com.abclearning;

public class Junit {
    public int add(int a, int b){
        return a + b;
    }
    public int factorialLoop(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}
