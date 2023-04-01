package com.infoshareacademy;


import com.infoshareacademy.factories.CarFactory;
import com.infoshareacademy.model.Car;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        Car car1 = CarFactory.createRandomCar();
        Car car2 = CarFactory.createRandomCar();
        Car car3 = CarFactory.createRandomCar();
        Car car4 = CarFactory.createRandomCar();

        car2.setEngine(null);
        car3.setEngine(null);


        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for (Car car : cars) {
            Optional<Engine> engineOptional = Optional.ofNullable(car.getEngine());
            if (engineOptional.isPresent()) {
                System.out.println("engineOptional = " + engineOptional.get().getPower());
            } else {
                System.out.println("Brak silnika ");

            }
        }

    }
}
