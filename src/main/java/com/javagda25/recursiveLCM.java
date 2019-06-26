package com.javagda25;

// Oblicza NWW (najmniejszą wspólną wielokrotnosć) podanych argumentów.
// LCM - Least Common Multiple
// Podpowiedź:
// NWW(a, b) = a * b / NWD(a, b)
// NWW(a1, a2, ..., an) = NWW(a1, NWW(a2, a3, ..., an))
// GCD - Greatest common divisor

public class recursiveLCM {
    public static void main(String[] args) {
        System.out.println(lcm(15, 6, 10));
//        System.out.println(gcd(54,24));
    }

    public static int lcm(int... numbers) {
        int nww;
        nww = (numbers[numbers.length - 2] * numbers[numbers.length - 1]) / gcd(numbers[numbers.length - 2], numbers[numbers.length - 1]);
        int[] numbers2 = new int[numbers.length - 1];
        for (int i = 0; i < numbers2.length - 1; i++) {
            numbers2[i] = numbers[i];
        }
        numbers2[numbers2.length - 1] = nww;
        numbers = numbers2;
        if (numbers.length > 2) {
            return lcm(numbers[numbers.length - 2], numbers[numbers.length - 1]);
        }
        return nww;
    }

    public static int gcd(int a, int b) {
        int nwd = 0;
        if (a < b) {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    nwd = i;
                }
            }
        } else {
            return gcd(b, a);
        }
        return nwd;
    }
}
