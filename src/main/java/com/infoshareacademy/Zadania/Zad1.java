package com.infoshareacademy.Zadania;

import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zad1 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("Kamil", "Ola", "Kuba", "", "Kasia", "", ""));
        List<Integer> integers = new ArrayList<>(List.of(-1, -2, -3, -4, 0, 1, 2, 3, 4, 5, 6, 7, 8));
        List<Engine> engines = EngineFactory.generateEngines(6);


        List<String> result = new ArrayList<>();
        Predicate<String> noEmpty = s -> !s.isEmpty();
        for (String s : strings) {
            if (noEmpty.test(s)) {
                result.add(s);
            }
        }
        System.out.println("result = " + result.size());

        System.out.println("\nZad 1 ----------------------------------------\n");


        Predicate<Integer> pred = i -> i > 0;
        for (Integer i : integers) {
            System.out.println("Czy liczba " + i + " jest powyżej zera - " + pred.test(i));
        }
        Predicate<Integer> pred1 = i -> i % 2 == 0;
        for (Integer i : integers) {
            System.out.println("Czy liczba " + i + " jest parzysta - " + pred1.test(i));
        }


        System.out.println("\nZad 2 ----------------------------------------\n");


        Consumer<Engine> consEngine = e -> System.out.println("getCapacity = " + e.getCapacity());
 /*       for (Engine e : engines){  // Można użyć pętli z kolekcji
            consEngine.accept(e);
        }*/
        engines.forEach(consEngine); // pętla z metody kolekcji


        System.out.println("\nZad 3 ----------------------------------------\n");


        Function<String, Integer> integerFunction = f -> f.length();
        for (String s : strings) {
            System.out.println(s);
            System.out.println("Name length = " + integerFunction.apply(s));
        }


        Function<Engine, Integer> funcEngine = fc -> fc.getPower();
        for (Engine e : engines) {
            System.out.println("Get power function = " + funcEngine.apply(e));
        }


        System.out.println("\nZad 4 ----------------------------------------\n");

        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println("random = " + random.get());
        System.out.println("random = " + random.get());
        System.out.println("random = " + random.get());

        Supplier<Engine> engineSupplier = () -> EngineFactory.generateEngine();
        System.out.println("engineSupplier = " + engineSupplier.get());
        System.out.println("engineSupplier = " + engineSupplier.get().getPower());
        System.out.println("engineSupplier = " + engineSupplier.get().getCapacity());


        System.out.println("\nZad 5 ----------------------------------------\n");

        Predicate<String> stringPredicate = s -> s.isEmpty();
        Consumer<String> stringPredicate1 = s -> System.out.println(s.toUpperCase());
        Function<String, Integer> stringPredicate2 = s -> s.length();
        strings.forEach(s -> System.out.println(s));
        System.out.println("----------------");
        strings.removeIf(stringPredicate);
        strings.forEach(s -> System.out.println(s));
        System.out.println("----------------");
        strings.forEach(stringPredicate1);
        strings.forEach(s -> System.out.println(s.toLowerCase()));
        System.out.println("----------------");
        for (String s : strings) {
            System.out.println(s + " " + stringPredicate2.apply(s));
        }


        System.out.println("\nZad 6 ----------------------------------------\n");





        System.out.println("\nZad 7 ----------------------------------------\n");
    }
}
