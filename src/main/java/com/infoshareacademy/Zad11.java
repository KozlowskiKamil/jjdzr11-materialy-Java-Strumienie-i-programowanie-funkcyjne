package com.infoshareacademy;


import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Zad11 {
    public static void main(String[] args) {

        Engine engine1 = new Engine(100, 1000);
        Engine engine2 = new Engine(100, 1000);
        Engine engine3 = new Engine(110, 2000);
        Engine engine4 = new Engine(200, 3000);

//        List<Engine> engines = new ArrayList<>();
//        engines.add(engine1);
//        engines.add(engine2);
//        engines.add(engine3);
//        engines.add(engine3);
//        engines.add(engine4);

        List<Engine> engines = EngineFactory.generateEngines(4);
        Consumer<Engine> consumer = e -> System.out.println("e = " + e);
        consumer.accept(engine1);
        consumer.accept(engine2);
        consumer.accept(engine3);
        consumer.accept(engine4);


    }
}
