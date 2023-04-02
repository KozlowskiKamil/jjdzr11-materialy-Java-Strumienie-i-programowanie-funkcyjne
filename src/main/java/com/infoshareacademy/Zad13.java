package com.infoshareacademy;


import com.infoshareacademy.model.Engine;

import java.util.function.Supplier;

public class Zad13 {
    public static void main(String[] args) {


        Supplier<Engine> engineSupplier = () -> new Engine(100, 1000);
        System.out.println("engineSupplier = " + engineSupplier.get());

    }
}
