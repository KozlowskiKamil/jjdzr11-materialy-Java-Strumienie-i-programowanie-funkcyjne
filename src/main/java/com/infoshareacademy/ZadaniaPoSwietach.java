package com.infoshareacademy;

import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        System.out.println("================ Zadanie 12 =========================");
        System.out.println(carList.stream().distinct().count());
        System.out.println(carList.stream().anyMatch(car -> car.getName().equalsIgnoreCase("Fiat")));
        System.out.println(carList.stream().anyMatch(car -> car.getEngine().getPower() > 200));
        long num = carList.stream().distinct().count();
        boolean fiat = carList.stream().anyMatch(car -> car.getName().equals("Fiat"));
        System.out.println("num = " + num);
        System.out.println("fiat = " + fiat);
        boolean power = carList.stream().map(car -> car.getEngine()).map(Engine::getPower).filter(pwr -> pwr > 100).count() > 0;
        System.out.println("power = " + power);
        System.out.println("================ Zadanie flatMap / reduce =========================");
        Stream.of(List.of(1, 2, 3, 4), List.of(6, 7, 8, 9)).flatMap(list -> list.stream()).collect(Collectors.toList());

        List<Integer> integers = List.of(1, 2, 3, 4);
        Integer reduce = integers.stream().reduce(2, (i1, i2) -> (i1 + i2));

        Integer result = 2;  // robi to samo co reduce
        for (Integer i : integers) {
            result = result + i;
        }
        System.out.println("reduce = " + reduce);
        System.out.println("result = " + result);

        List<String> strings = new ArrayList<>();
        strings.add("Kamil");
        strings.add("Kasia");
        strings.add("Kuba");
        String reduceStr = strings.stream().reduce("Dowolna wartość ", (s1, s2) -> s1 + s2 + ";");
        System.out.println("reduceStr = " + reduceStr);

        System.out.println("\n================ Zadanie 14 =========================\n");

        List<String> collect = carList.stream().map(car -> car.getName()).distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);

        Integer carPower = carList.stream()
                .map(car -> car.getEngine().getPower())
                .reduce(0, (e1, e2) -> e1 + e2);


        carList.stream().forEach(car -> System.out.println("car.getEngine().getPower() = " + car.getEngine().getPower()));
        System.out.println("carPower = " + carPower);

        carList.stream().filter(car -> car.getEngine().getPower() > 130).forEach(s -> System.out.println("s = " + s.getEngine().getPower()));
        List<Car> cars = carList.stream().sorted(Comparator.comparing(car -> car.getEngine().getPower())).toList();
        cars.stream().limit(3).forEach(s -> System.out.println("s = " + s));  // limit(3) tylko 3 pierwsze wyniki

        System.out.println("\n================ Zadanie 15 =========================");


        System.out.println("================ Zadanie 16 =========================");


    }
}
