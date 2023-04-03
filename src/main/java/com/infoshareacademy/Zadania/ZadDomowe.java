package com.infoshareacademy.Zadania;

import java.util.function.Consumer;

public class ZadDomowe {
    static void prettyPrint(String name, Consumer stringConsumer) {
        stringConsumer.accept(name);
    }

    public static void main(String[] args) {
        String name = "Kamil";
        Consumer<String> stringConsumer0 = s -> System.out.println(s);
        Consumer<String> stringConsumer1 = s -> System.out.println(s.toLowerCase());
        Consumer<String> stringConsumer2 = s -> System.out.println(s.toUpperCase());
        Consumer<String> stringConsumer3 = s -> System.out.println(s.charAt(2));
        Consumer<String> stringConsumer4 = s -> System.out.println(s.length());

        prettyPrint(name, stringConsumer0);
        prettyPrint(name, stringConsumer1);
        prettyPrint(name, stringConsumer2);
        prettyPrint(name, stringConsumer3);
        prettyPrint(name, stringConsumer4);
    }
}
