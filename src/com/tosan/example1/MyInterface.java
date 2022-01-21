package com.tosan.example1;

public interface MyInterface {
    String print();
    default void print1(){
        System.out.println("Default print1");
    }
}
