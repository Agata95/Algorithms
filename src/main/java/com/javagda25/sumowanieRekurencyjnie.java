package com.javagda25;

// rekurencyjnie zsumuj tablicę

public class sumowanieRekurencyjnie {
    public static void main(String[] args) {
        int[] array = {45, 12, 9, -13, 42, 42, 78, 21, 34, 78, 0, 999};
        int[] array2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(sumujTablice(array, 11));

    }

    static int sumujTablice(int[] array, int size) {
        return size != 0 ? sumujTablice(array, size - 1) + array[size] : array[size];

// rozwiniecie:
//        if (size != 0) {
//            return sumujTablice(array, size - 1) + array[size];
//        } else {
//            return array[0];
//        }
    }
}
