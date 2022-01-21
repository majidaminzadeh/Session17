package com.tosan.example2;

public class MyClass {

    public MyClass(Object str){
        System.out.println("I am MyClass constructor running " + str);
    }

    public MyClass(String str){
        System.out.println("I am MyClass constructor running " + str);
    }

    public MyClass(){

    }

    private int index = 10;
    //..

    public static void transfer(int balance){

    }

    public static void transfer(long balance){

    }

    public static void transfer(String str){
        System.out.println("I am doing something with " + str);
    }

    public void transfer1(String str){
        System.out.println("I am doing something with " + str + index);
    }

    public void transfer2(String str, String str2){
        System.out.println("I am doing something with " + str + index + str2);
    }

    //..
}
