package com.tosan.example3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {
    // 1- Intermediate Operation
    // 2- Terminal Operation
    public static void main(String[] args) {
        String[] strings = {"a", "w"};
        List<String> list = Arrays.asList("A", "A", "Crdc", "De", "e", "zopedd");
        list.forEach(System.out::println);
        System.out.println("-----------------");
//        List<String> stringList = list.stream().map(t->t.toLowerCase()).map(t->t.concat("3")).collect(Collectors.toList());
//        List<NumberOfStringChars> stringList = list.stream()
//                .filter(t->t.toCharArray().length > 2)
//                .map(t->t.toUpperCase())
//                .map(t->t.substring(1))
//                .map(t->{
//                    NumberOfStringChars chars = new NumberOfStringChars();
//                    chars.length = t.toCharArray().length;
//                    chars.str = t;
//                    return chars;
//                })
//                .peek(t-> t.length = t.length *2)
//                .collect(Collectors.toList());
//        stringList.forEach(t-> System.out.println(t.length));



//        boolean b = list.stream().allMatch(t->t.toCharArray().length >= 1);
//        System.out.println(b);
//        long count = list.stream().filter(t->t.toCharArray().length > 2).count();
//        System.out.println(count);
//        list.stream().distinct().forEach(System.out::println);
        Optional<String> optional = list.stream().filter(t->t.toCharArray().length > 2).findFirst();
        System.out.println(optional.get());
    }


    public static void streamExample(){
//        List<String> list = Arrays.asList("Ao", "bpd", "Crdc", "De", "e", "zopedd");
//        Stream<String> stream1 = list.stream();
//        Stream<String> stream2 = stream1.filter(t->t.toCharArray().length > 2);
//        Stream<String> stream21 = stream2.peek(System.out::println);
//        Stream<String> stream3 = stream21.map(t->t.toUpperCase());
//        System.out.println("-----------------");
//        stream3.peek(System.out::println);
//        Stream<String> stream4 = stream3.map(t->t.substring(1));
//        System.out.println("-----------------");
//        stream4.peek(System.out::println);
//        List<String> stringList = stream4.collect(Collectors.toList());
//        System.out.println("-----------------");
//        stringList.forEach(System.out::println);
    }
}
