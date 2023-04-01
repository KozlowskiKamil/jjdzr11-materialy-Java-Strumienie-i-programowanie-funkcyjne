package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Zad5 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Kamil", "Ola", "Kuba", "Kasia", "Daniel"));
        list.forEach(s -> System.out.println("s = " + s));
        list.forEach(s -> System.out.println("s = " + s.toUpperCase()));
        list.forEach(s -> System.out.println("s = " + s.charAt(0)));

    }
}