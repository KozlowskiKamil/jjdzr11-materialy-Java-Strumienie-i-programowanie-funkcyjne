package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        numbers.stream().forEach(s -> System.out.println("s = " + s));

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        List<Integer> streams = stream1.toList();

        streams.forEach(System.out::println);





/*        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();
        Car car4 = CarFactory.createRandomCar();


        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.forEach(System.out::println);
        cars.forEach(car -> System.out.println("car = " + car));

        cars.forEach(car -> car.getEngine().getPower());*/
    }
}
