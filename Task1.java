package com.company;

public class Task1 {

    public static void main(String[] args) {
        repeat("mice", 5); // "mmmmmiiiiiccccceeeee"
        repeat("hello", 3);// "hhheeellllllooo"
        repeat("stop", 1);// "stop"
    }

    private static void repeat(String s, int n) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= n; j++)
                a+=s.charAt(i);
        }
        System.out.println(a);
    }

}
