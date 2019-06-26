package com.javagda25;

public class silniaRekurencyjnie {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(1));
    }

    static int recursiveFactorial(int number) {
        if (number > 1) {
            return recursiveFactorial(number - 1) * number;
        } else {
            return 0;
        }
    }
}
