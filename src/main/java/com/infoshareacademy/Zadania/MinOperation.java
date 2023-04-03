package com.infoshareacademy.Zadania;

import java.util.List;

public class MinOperation implements MathOperation {
    @Override
    public Integer calculate(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer i : numbers){
            if (min > i){
                min = i;
            }

        }
        return min;
    }
}