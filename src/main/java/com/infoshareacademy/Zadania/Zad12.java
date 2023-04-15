package com.infoshareacademy.Zadania;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zad12 {
    public static void main(String[] args) {
        List<Car> cars = CarFactory.createRandomCars(500);
        long carsUnic = cars.stream().distinct().count();
        System.out.println("Unikalne pojazdy z 500 to = " + carsUnic);
        boolean fiat = cars.stream().anyMatch(c -> c.getName().startsWith("Fiat"));
        System.out.println("fiat = " + fiat);
        boolean hp100 = cars.stream().anyMatch(car -> car.getEngine().getPower().intValue() == 100);
        System.out.println("hp100 = " + hp100);
        boolean hp200 = cars.stream().anyMatch(car -> car.getEngine().getPower().intValue() == 200);
        System.out.println("hp200 = " + hp200);
        //     cars.forEach(car -> System.out.println(car.getEngine().getPower()));

        List<Car> list = cars.stream().filter(car -> car.getName().equalsIgnoreCase("Fiat")).collect(Collectors.toList());

        ArrayList<Car> arrayList = new ArrayList<>(list);
        arrayList.forEach(car -> System.out.println("car = " + car));
        System.out.println("arrayList = " + arrayList.size());
        System.out.println("list.size() = " + list.size());
        System.out.println("cars = " + cars.size());


    }
}