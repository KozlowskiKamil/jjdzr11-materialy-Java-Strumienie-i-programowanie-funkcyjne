package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Zad {

    private static void runOperation(MathOperation mathOperation, List<Integer> numberss) {
        Integer calculatedValue = mathOperation.calculate(numberss);
        System.out.println("calculatedValue = " + calculatedValue);
    }

    public static void main(String[] args) {
        MaxOperation maxOperation = new MaxOperation();
        MinOperation minOperation = new MinOperation();


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(maxOperation.calculate(numbers));
        System.out.println(minOperation.calculate(numbers));

        runOperation(maxOperation, numbers);
        runOperation(minOperation, numbers);

        MathOperation lambda = (List<Integer> value) -> value.get(0);
        runOperation(lambda,numbers);




    }
}
