package com.company;

public class Task1 {

    public static void main(String[] args) {
        repeat("mice", 5); // "mmmmmiiiiiccccceeeee"
        repeat("hello", 3);// "hhheeellllllooo"
        repeat("stop", 1);// "stop"
    }

    private static void repeat(String s, int n) {
        String a = "";      //вводим строку, в которую будем записывать повторяющтеся слова
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= n; j++)
                a+=s.charAt(i);   //приводим каждвйы символ строки s к типу char и прибавляем к строке a
        }
        System.out.println(a);
    }

}
