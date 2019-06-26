package com.javagda25;

// Zaimplementuj poniższą metodę Z WYKORZYSTANIEM REKURENCJI.
// Odwraca podany napis, np. dla "test" zwraca "tset".

public class recursiveReverse {
    public static void main(String[] args) {
        reverse("tekst");
        System.out.println();
        System.out.println(recursiveRevers("tekstowo"));
    }

    public static void reverse(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static String recursiveRevers(String text) {
        if (text.isEmpty()) {
            return text;
        }
        return recursiveRevers(text.substring(1)) + text.charAt(0);
    }
}
