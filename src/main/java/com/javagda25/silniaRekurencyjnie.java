package com.javagda25;

public class silniaRekurencyjnie {
    public static void main(String[] args) {
        System.out.println(silnia(5));
    }

    static int silnia(int liczba) {
        if (liczba != 1) {
            return silnia(liczba - 1) * liczba;
        } else {
            return liczba;
        }
    }
}
