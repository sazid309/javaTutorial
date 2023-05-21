package com.tutorial;

public class HelloWorld {
    public HelloWorld(){
        System.out.println("in constructer");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld helloWorld=new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        System.out.println(helloWorld);
        System.out.println(helloWorld1);
    }
}