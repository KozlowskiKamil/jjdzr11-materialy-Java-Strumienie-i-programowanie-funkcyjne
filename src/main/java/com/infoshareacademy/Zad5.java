package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Zad5 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Kamil", "Ola", "Kuba", "Kasia", "Daniel"));
        list.forEach(n -> System.out.println("n = " + n));
        list.forEach(n -> System.out.println("n = " + n.toUpperCase()));
        list.forEach(n -> System.out.println("n = " + n.charAt(0)));

    }
}
