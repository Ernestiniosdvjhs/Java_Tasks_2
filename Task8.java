package com.company;

public class Task8 {
    public static void main(String[] args) {
        isStrangePair("ratio", "orator");// true
        isStrangePair("sparkling", "groups");// true
        isStrangePair("bush", "hubris");// false
        isStrangePair("", "");// true
    }

    static void isStrangePair(String a, String b) {
        boolean ans = false;
        if (a.length()==0 && b.length()==0) {
            ans = true;
        }   else if (a.length()!=0 && b.length()!=0) {

            char a1 = a.charAt(0);
            char b1 = b.charAt(0);
            char a2 = a.charAt(a.length() - 1);
            char b2 = b.charAt(b.length() - 1);
            if (a1 == b2 && a2 == b1)
                ans = true;
        }
        System.out.println(ans);
    }
}
