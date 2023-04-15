package com.infoshareacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Zad16 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "iSA", "java", "streams");
        Set<Character> unic = strings.stream().flatMapToInt(CharSequence::chars)
                .mapToObj(c -> (char) c).collect(Collectors.toSet());
        List<Character> sortedLeter = new ArrayList<>(unic);
        Collections.sort(sortedLeter);
        System.out.println("sortedLeter = " + sortedLeter);


    }
}
