package com.infoshareacademy;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return false;
    }
}
