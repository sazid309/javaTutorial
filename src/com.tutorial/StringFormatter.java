package com.tutorial;

import java.util.Scanner;


/*
Input:
2
vazid 4
sazid 6

Output:
==============
vazid      4
sazid      6
==============
 */
public class StringFormatter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("==========================");
        for(int i=0;i<2; i++)
        {
            String s1 = sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1,x);
        }
        System.out.println("=========================");
    }
}
