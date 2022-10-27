package com.company;

public class Task6 {
    public static void main(String[] args) {
        Fibonacci(3);// 3
        Fibonacci(7);// 21
        Fibonacci(12);// 233
    }

    static void Fibonacci(int n) {
        int sum = 1;
        int a = 0;
        for (int i = 1; i <= n; i++) {
            int b = sum;
            sum+= a;
            a = b;
        }
        System.out.println(sum);
    }
}
