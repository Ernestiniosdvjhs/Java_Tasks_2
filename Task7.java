package com.company;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(isValid("59001"));// true
        System.out.println(isValid("853a7"));// false
        System.out.println(isValid("732 32"));// false
        System.out.println(isValid("393939"));// false
    }

    static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char g = s.charAt(i);
            if (Character.isLetter(g))
                return false;
        }
        if (s.length()!=5)
            return false;
        return true;
    }
}
