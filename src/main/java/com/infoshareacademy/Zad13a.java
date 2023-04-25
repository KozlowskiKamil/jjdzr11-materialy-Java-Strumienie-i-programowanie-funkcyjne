package com.infoshareacademy;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Zad13a {
    public static void main(String[] args) {
        List<Car> cars = CarFactory.createRandomCars(10);
        System.out.println("Przed sortowaniem name");
        cars.forEach(car -> System.out.print(" " + car.getName()));
        System.out.println("\nPo sortowaniu name");
        cars.stream().sorted((car1, car2) -> car2.getName().length() - car1.getName()
                .length()).forEach(car -> System.out.print(" " + car.getName()));
        System.out.println("\n\nPrzed sortowaniem engine");
        cars.forEach(car -> System.out.print(" " + car.getEngine().getPower()));
        System.out.println("\nPo sortowaniu engine");
        cars.stream().sorted((car1, car2) -> car2.getEngine().getPower() - car1.getEngine()
                .getPower()).forEach(car -> System.out.print(" " + car.getEngine().getPower()));

        List<Car> cars1 = cars.stream().sorted((car1, car2) -> car2.getEngine().getPower() - car1.getEngine()
                .getPower()).collect(Collectors.toList());

        cars1.forEach(car -> System.out.println("car = " + car.getEngine().getPower()));


    }
}
