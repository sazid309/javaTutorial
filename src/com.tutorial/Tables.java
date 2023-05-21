package com.tutorial;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        for (int i = 1; i <= 10; i++) {
            int k =n*i;
            System.out.printf("%d * %d = %d%n",n,i,k);
        }
    }
}
