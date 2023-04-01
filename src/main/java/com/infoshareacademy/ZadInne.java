package com.infoshareacademy;

import com.infoshareacademy.model.Engine;

import java.util.HashSet;
import java.util.Set;

public class ZadInne {
    public static void main(String[] args) {


        Engine engine1 = new Engine(100, 1000);
        Engine engine2 = new Engine(100, 1000);
        Engine engine3 = new Engine(110, 2000);
        Engine engine4 = new Engine(200, 3000);

        Set<Engine> engines = enginsSet(engine1, engine2, engine3, engine3, engine4);
        engines.add(engine1);
        engines.add(engine2);
        engines.add(engine3);
        engines.add(engine3);
        engines.add(engine4);

        System.out.println("engines = " + engines);
        System.out.println("engines = " + engines.size());

        for (Engine e : engines) {
            System.out.println(e);
        }
    }

    private static Set<Engine> enginsSet(Engine... engines) {

        Set<Engine> result = new HashSet<>();
        for (Engine e : result) {
            result.add(e);
        }

        return result;
    }
}