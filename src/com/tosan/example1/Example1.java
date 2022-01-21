package com.tosan.example1;

public class Example1 {
    public static void main(String[] args) {
        MyInterface myInterface = () ->{ return "one line of code!";};
    }

    private static void doPrint(MyInterface myInterface) {
    }
}
