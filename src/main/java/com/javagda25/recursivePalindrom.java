package com.javagda25;

public class recursivePalindrom {
    public static void main(String[] args) {
        System.out.println(recursivePalindrom("kajak"));
    }

    static boolean recursivePalindrom(String word) {
        if (word.length() >= 2 && word.charAt(0) == word.charAt(word.length() - 1)) {
            return recursivePalindrom(word.substring(1, word.length() - 1));
        } else if (word.length() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
