package com.infoshareacademy;

import java.util.List;

public class MaxOperation implements MathOperation {

    @Override
    public Integer calculate(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer i : numbers){
            if (max < i){
                max = i;
            }

        }
            return max;
    }
}
