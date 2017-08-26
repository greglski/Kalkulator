package com.kodilla.kalkulator;

public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public int substractionBFromA(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int addition = calculator.addition(2, 2);
        int substractionBFromA = calculator.substractionBFromA(5, 2);
        System.out.println("addition = " + addition + "\n" + "substraction = " + substractionBFromA);
    }
}
