package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main in1 = new Main();
        in1.printHello();
        Main in2 = new Main();
        in2.printHello();

    }

    void printHello(){
        System.out.println("Hello..");
    }
}