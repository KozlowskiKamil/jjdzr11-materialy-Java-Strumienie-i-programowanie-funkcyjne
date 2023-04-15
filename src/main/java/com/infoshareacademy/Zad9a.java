package com.infoshareacademy;

import com.infoshareacademy.MathOperation;
import com.infoshareacademy.Zad13a;
import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Zad9a {
    public static <T, R> void applyForParm(Car car, Function<T, R> function) {
        R result = function.apply((T) car);
        System.out.println("result = " + result);
    }
    public static <T, R> void printResult2(List<Car> numbers, Function<T, R> function, Consumer<R> consumer) {
        R result = function.apply((T) numbers);
        consumer.accept(result);
    }
    public static void main(String[] args) {
        List<Car> cars = CarFactory.createRandomCars(10);
        Function<Car, String> getName = car -> car.getName();
        Function<Car, Integer> getSpeed = car -> car.getMaxSpeed();
        Function<Car, Engine> getEngine = car -> car.getEngine();

        System.out.println("cars = " + cars.get(1));
        applyForParm(cars.get(1), getName);
        applyForParm(cars.get(1), getSpeed);
        applyForParm(cars.get(1), getEngine);

/*        Function<List<Car>, Integer> function = integers -> integers.size();
        Function<List<Car>, Integer> function2 = List::size;
        Consumer<Integer> cons = con -> con.intValue();

        printResult2(cars, getSpeed, cons);*/

    }
}
