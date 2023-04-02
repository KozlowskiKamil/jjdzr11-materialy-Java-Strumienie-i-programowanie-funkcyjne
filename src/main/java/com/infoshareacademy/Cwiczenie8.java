package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Cwiczenie8 {
    public static void main(String[] args) {
        MathOperation maxOperation = new MaxOperation();
        MathOperation minOperation = new MinOperation();


        MathOperation lambda = (list) -> list.size();

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        printResult();

    }

    public static void printResult(List<Integer> numbers, MathOperation mathOperation) {
        Integer valueCalc = mathOperation.calculate(numbers);
        System.out.println("valueCalc = " + valueCalc);
    }
}
