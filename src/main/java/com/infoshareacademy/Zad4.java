package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list.forEach(n -> System.out.println("n = " + n));
        list.forEach(n -> System.out.println("n = " + n));
        list.forEach(n -> System.out.println("n = " + n));
        list.forEach(n -> System.out.println(n * 2));

    }
}
