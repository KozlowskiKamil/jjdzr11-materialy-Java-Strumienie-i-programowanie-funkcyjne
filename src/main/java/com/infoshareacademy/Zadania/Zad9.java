package com.infoshareacademy.Zadania;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Zad9 {
    public static void main(String[] args) {
        MathOperation maxOperation = new MaxOperation();
        MathOperation minOperation = new MinOperation();

        MathOperation lambdaTest = (listOfNumbers) -> listOfNumbers.get(0);

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Function<List<Integer>, Integer> list = i -> i.get(3);


//        printResult(maxOperation, numbers);
//        printResult(minOperation, numbers);
//        printResult(lambdaTest, numbers);
    }


    private static void printResult(Function<Integer, Integer> mathOperation, List<Integer> numbers, Consumer<Integer> showInt) {
    //    Integer calculatedValue = mathOperation.calculate(numbers);
      //  System.out.println(calculatedValue);
    }

    private static void predicateExample() {
        List<String> strings = List.of("Tomasz", "Kinga", "", "Mikołaj", "Przemysław", "");

        System.out.println(strings.size());

        Predicate<String> noEmptyString = s -> !s.isEmpty();

        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (noEmptyString.test(s)) {
                result.add(s);
            }
        }

        System.out.println(result.size());
    }
}