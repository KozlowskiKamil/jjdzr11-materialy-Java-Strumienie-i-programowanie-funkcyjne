package com.infoshareacademy;


import com.infoshareacademy.factories.EngineFactory;
import com.infoshareacademy.model.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Zad12 {
    public static void main(String[] args) {


        Function<Engine, Integer> power = e -> e.getPower();
        List<Engine> engines1 = EngineFactory.generateEngines(5);
        for (Engine e : engines1) {
            System.out.println(e);

        }
    }
}
