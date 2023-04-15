package com.infoshareacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Zad9bb {
    public static void main(String[] args) {
/*        InterfaceFunc2 interfaceFunc2 = (one, two) -> {
            double result = one + two;
            return result;
        };
        double nowy = interfaceFunc2.blabla(2, 2);
        System.out.println("nowy = " + nowy);*/


        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Function<List<Integer>, Integer> function = integers -> integers.get(1);
        Function<List<Integer>, Integer> function2 = List::size;
        Function<List<Integer>, String> function3 = integers -> integers.toString();
        Consumer<Integer> cons = con -> System.out.println("Result int = " + con);
        Consumer<String> cons2 = con -> System.out.println("Result string= " + con);

        printResult(numbers, function, cons);
        printResult(numbers, function2, cons);
        printResult(numbers, function3, cons2);

    }

    public static <T, R> void printResult(List<Integer> numbers, Function<T, R> function, Consumer<R> consumer) {
        R result = function.apply((T) numbers);
        consumer.accept(result);
    }
}