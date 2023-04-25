package com.infoshareacademy;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class ZadaniaPoSwietach {

    public static void zad9a(Car car, Function<Car, Object> function) {
        System.out.println("Zad 9a " + function.apply(car));
    }

    public static void zad9b(Function<List<Integer>, Integer> function, List<Integer> numbers, Consumer<Integer> consumer) {
        consumer.accept(function.apply(numbers));
    }

    public static void main(String[] args) {
        List<Car> carList = CarFactory.createRandomCars(5);
        List<Engine> engineList = EngineFactory.generateEngines(5);
        Engine engine1 = EngineFactory.generateEngine();
        Engine engine2 = EngineFactory.generateEngine();
        Engine engine3 = EngineFactory.generateEngine();
        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();

        System.out.println("================ Zadanie 9a  =========================");
        zad9a(car1, car -> car.getName());
        zad9a(car2, car -> car.getMaxSpeed());
        zad9a(car3, car -> car.getEngine().getPower());


        System.out.println("================ Zadanie 9b =========================");
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        zad9b(integers -> integers.size(), integerList, System.out::println);
        zad9b(integers -> integers.get(3), integerList, integer -> System.out.println("integer 4 * 3 = " + integer * 3));

        System.out.println("================ Zadanie  =========================");


        System.out.println("================ Zadanie  =========================");


        System.out.println("================ Zadanie  =========================");
    }
}
