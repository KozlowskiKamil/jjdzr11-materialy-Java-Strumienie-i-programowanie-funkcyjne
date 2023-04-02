package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Cwiczenie7 {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        strings.add("Andrzej");
        strings.add("Kuba");
        strings.add("Ola");
        strings.add("Marek");
        strings.add("Kasia");
        strings.add("");
        strings.add("");
        strings.add("");

        strings.forEach(n -> System.out.println("n = " + n));
        Predicate<String> predicate2 = s -> s.isEmpty();

        System.out.println("----------------------");

        strings.removeIf(predicate2);
        strings.forEach(n -> System.out.println("n = " + n.toUpperCase()));

        System.out.println("----------------------");

        Function<String, Integer> func = s -> s.length();
        for (String str : strings) {
            System.out.println(func.apply(str));
        }

    }
}
