package com.infoshareacademy;

import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Powtórka {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Predicate<Integer> pred = integer -> integer > 2;
        Predicate<Integer> pred2 = integer -> integer.equals(3);
        Predicate<Integer> pred3 = n -> n % 2 == 0;
        boolean result = pred2.test(4);
        System.out.println("result = " + result);
        for (Integer i : numbers) {
            System.out.println("pred 1 " + pred.test(i));
            System.out.println("pred 2 " + pred2.test(i));
            System.out.println("pred3 = " + pred3.test(i));
        }
        System.out.println("\nZad consumer ----------------------------------------\n");
        Consumer<Integer> consumer = n -> System.out.println(n * 2);
        numbers.forEach(consumer);
        System.out.println("\nZad consumer ENGINE ----------------------------------------\n");
        List<Engine> engines = EngineFactory.generateEngines(5);
        Consumer<Engine> consEng = engine -> System.out.println(engine.getPower());
        Consumer<Engine> consEng2 = engine -> System.out.println(engine.getCapacity());
        engines.forEach(consEng);
        engines.forEach(consEng2);

        System.out.println("\nFunction  ----------------------------------------\n");

        Function<Engine, Integer> engInt = e -> e.getPower();
        for (Engine e : engines) {
            System.out.println(engInt.apply(e));
        }
        System.out.println("\nSuplier  ----------------------------------------\n");
        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println("random = " + random.get());
        System.out.println("random = " + random.get());
        System.out.println("random = " + random.get());

        Supplier<Engine> engineSupplier = () -> EngineFactory.generateEngine();
        System.out.println("engineSupplier = " + engineSupplier.get().getPower());
        System.out.println("engineSupplier = " + engineSupplier.get().getCapacity());
        System.out.println("engineSupplier = " + engineSupplier.get().getPower());
        System.out.println(engineSupplier.get());
        System.out.println("\nZadanie 7  ----------------------------------------\n");

        List<String> strings = new ArrayList<>(List.of("Kamil", "Ola", "Kuba", "Kasia", "", ""));
        Predicate<String> rem2 = s -> s.isEmpty();
        Consumer<String> uper = su -> System.out.println(su.toUpperCase());
        strings.removeIf(rem2);
        strings.forEach(uper);
        Function<String, Integer> leng = n -> n.length();
        for (String s : strings) {
        //    System.out.println("s = " + s);
            int result1 = leng.apply(s);
            System.out.println("result1 = " + result1);
        }
    }
}
