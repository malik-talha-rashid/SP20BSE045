package com.lab6.calculator;

public class calculator {
    public calculator() {
}

    static void Sum(int x, int y) {
        System.out.println("The sum is: " + (x + y));
    }

    static void Multiply(int x, int y) {
        System.out.println("The multiple is: " + x * y);
    }

    static void Divide(int x, int y) {
        System.out.println("The divided value is: " + x / y);
    }

    static void Modulus(int x, int y) {
        System.out.println("The modulus is: " + x % y);
    }

    static void Sin(double x) {
        System.out.println("SIN: " + Math.sin(x));
    }

    static void Cos(double x) {
        System.out.println("Cos: " + Math.cos(x));
    }

    static void Tan(double x) {
        System.out.println("tan is: " + Math.tan(x));
    }
}


