package com.infoshareacademy.Zadania;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Zad12 {
    public static void main(String[] args) {

        List<Car> cars = CarFactory.createRandomCars(500);
        long carsUnic = cars.stream().distinct().count();
        System.out.println("Unikalne pojazdy z 500 to = " + carsUnic);
        System.out.println(cars.stream().filter(car -> car.getEngine().getPower() == 200));

        System.out.println(cars.stream().filter(c -> c.getName() == "Fiat"));
        Stream<Car> equals1 = cars.stream().filter(c -> c.getName() == "Fiat");
        System.out.println("equals2 = " + equals1);
        boolean equals2 = cars.stream().filter(c -> c.getName() == "Fiat").isParallel();
        System.out.println("equals2 = " + equals2);

    }
}
