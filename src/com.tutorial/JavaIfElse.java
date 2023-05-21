package com.tutorial;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 != 0) {
            System.out.println("wired");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("not wired");
            } else if (N > 6 && N <= 20) {
                System.out.println(" wired");
            } else {
                System.out.println("not wired");
            }
        }
    }
}
