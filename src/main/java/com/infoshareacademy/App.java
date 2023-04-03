package com.infoshareacademy;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<String> stringsStream = Stream.of("napis", "Tomasz", "");

        List<String> strings = stringsStream.toList();
//        List<String> strings = stringsStream.collect(Collectors.toList());

//        stringsStream.forEach(System.out::println);
        System.out.println(strings);
    }


    private static void printResult(MathOperation mathOperation, List<Integer> numbers) {
        Integer calculatedValue = mathOperation.calculate(numbers);
        System.out.println(calculatedValue);
    }

    private static void predicateExample() {
        List<String> strings = List.of("Tomasz", "Kinga", "", "Mikołaj", "Przemysław", "");

        System.out.println(strings.size());

        Predicate<String> noEmptyString = s -> !s.isEmpty();

        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (noEmptyString.test(s)) {
                result.add(s);
            }
        }

        System.out.println(result.size());
    }
}