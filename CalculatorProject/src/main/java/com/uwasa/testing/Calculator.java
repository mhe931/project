package com.uwasa.testing;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public Object divide(int a, int b) {
        if (b == 0) {
            return "Error: Division by zero";
        }
        return (double) a / b;
    }
    
    public int calculatePower(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}
