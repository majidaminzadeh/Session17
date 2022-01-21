package com.tosan.example2;

import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {

        // anonymous class
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };

        // lambda expression
        Consumer<String> consumer2 = t -> System.out.println(t);

        // Static method reference
        Consumer<String> consumer3 = MyClass::transfer;

        // non-static method reference
        MyClass myClass = new MyClass();
        Consumer<String> consumer4 = myClass::transfer1;


        // overload method reference
        Consumer<Integer> consumer = MyClass::transfer;


        //Constructor method reference
        Consumer<String> consumer5 = MyClass::new;

        consumer5.accept("constructor method reference");
    }
}
