package com.infoshareacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        InterfaceFunc2 interfaceFunc1 = (one, two) -> one / two;
        InterfaceFunc2 interfaceFunc2 = (one, two) -> one + two;
        InterfaceFunc2 interfaceFunc3 = (one, two) -> one * two;

        //    interfaceFunc2.blabla(2.2, 3.3);

        myTest(interfaceFunc1);
        myTest(interfaceFunc2);
        myTest(interfaceFunc3);


        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        MathOperation mathOperation = (List<Integer> integers) -> {
            int min = numbers.get(0);
            for (Integer i : numbers) {
                if (min > i) {
                    min = i;
                }

            }
            return min;
        };
        MathOperation mathOperation2 = (List<Integer> integers) -> {
            int max = numbers.get(0);
            for (Integer i : numbers) {
                if (max < i) {
                    max = i;
                }

            }
            return max;
        };


        MathOperation mathOperation3 = (List<Integer> integers) -> numbers.get(3); // metoda get

        MathOperation mathOperation4 = (List<Integer> integers) -> {  // sortowanie min number
            Collections.sort(numbers);
            return numbers.get(0);
        };

        MathOperation mathOperation5 = (List<Integer> integers) -> { // sortowanie max number
            Collections.sort(numbers);
            return numbers.get(numbers.size() - 1);
        };


        printResult(numbers, mathOperation);
        printResult(numbers, mathOperation2);
        printResult(numbers, mathOperation3);
        printResult(numbers, mathOperation4);
        printResult(numbers, mathOperation5);


    }

    public static void myTest(InterfaceFunc2 interfaceFunc2) {
        double result = interfaceFunc2.blabla(2.2, 3.3);
        System.out.println("result = " + result);
    }

    public static void printResult(List<Integer> numbers, MathOperation mathOperation) {
        Integer valueCalc = mathOperation.calculate(numbers);
        System.out.println("valueCalc = " + valueCalc);
    }
}