package com.infoshareacademy;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PoSwietach {


    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);
        numbers.stream().filter(i -> i % 2 == 0).map(i -> i.floatValue())
                .forEach(System.out::println);
        System.out.println("======================================");
        List<Car> cars = CarFactory.createRandomCars(5);
        List<Engine> engCars = cars.stream().map(c -> c.getEngine())
                .peek(engine -> engine.getPower())
                .filter(engine -> engine.getCapacity() > 2000).collect(Collectors.toList());

        List<Integer> intList = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6)).flatMap(l -> l.stream())
                .collect(Collectors.toList());
        System.out.println("======================================");


        List<Integer> numb = List.of(1, 2, 3, 4);
        numb.stream().reduce(0, (i1, i2) -> i1 + i2);

        System.out.println("=zad 14=====================================");
        List<Car> cars15 = CarFactory.createRandomCars(10);
        cars15.stream().map(car -> car.getName()).distinct().forEach(s -> System.out.println("s = " + s));
        cars15.stream().map(car -> car.getEngine().getPower() > 150).forEach(System.out::println);

        List<String> unic = cars15.stream().map(Car::getName).distinct().toList();
        System.out.println("unic = " + unic);

        Integer sumEngPower = cars15.stream()
                .map(car -> car.getEngine().getPower())
                .reduce(0, (p1, p2) -> p1 + p2);
        System.out.println("sumEngPower = " + sumEngPower);

        List<Car> carPower150 = cars15.stream()
                .filter(car -> car.getEngine().getPower() > 150).toList();
        System.out.println("carPower150 = " + carPower150);


        List<Integer> carPower100 = cars15.stream()
                .filter(car -> car.getEngine().getPower() > 100)
                .map(car -> car.getEngine().getPower()).sorted().toList();
        System.out.println("carPower100 = " + carPower100);

        System.out.println("======================================");
        Set<String> strings = new HashSet<>(List.of("Kamil", "Kuba", "Ola", "ola", "Kasia", "kasia"));
        strings.forEach(s -> System.out.println("s = " + s));

        zMalej(strings);
        toUper(strings);
        spacja(strings);
        printlongest(strings);

        System.out.println("======================================");

        List<String> listW = new ArrayList<>();
        listW.add("hello");
        listW.add("iSA");
        listW.add("java");
        listW.add("streams");
        listW.stream().map(s -> s.toCharArray()).distinct().forEach(s -> System.out.println("s = " + s));



    }

    private static void zMalej(Set<String> strings) {
        List<String> str = strings.stream().filter(s -> Character.isLowerCase(s.charAt(0))).toList();

    }

    private static void toUper(Set<String> strings) {
        strings.stream().map(String::toUpperCase);
    }

    private static void spacja(Set<String> strings) {
        strings.stream().filter(s -> s.contains(" "));


    }

    public static void printlongest(Set<String> strings) {
        Optional<String> longest = strings.stream().max(Comparator.comparingInt(String::length));
        longest.ifPresent(s -> System.out.println("s = " + s + s.length()));
    }

    public static void printlist(Set<String> strings) {
        List<Integer> lengts = strings.stream().map(s -> s.length()).toList();
        System.out.println("lengts = " + lengts);
    }

}
