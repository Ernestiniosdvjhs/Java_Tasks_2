package com.company;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));// true
        System.out.println(isSuffix("arachnophobia", "-phobia"));// true
        System.out.println(isPrefix("retrospect", "sub-"));// false
        System.out.println(isSuffix("vocation", "-logy"));// false
    }

    static boolean isPrefix(String a, String b) {
        for (int i = 0; i < b.length()-2; i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    static boolean isSuffix(String a, String b) {
        for (int i = 0; i < b.length()-1; i++) {
            if (a.charAt(a.length()-1-i) != b.charAt(b.length()-1-i))
                return false;
        }
        return true;
    }

}
