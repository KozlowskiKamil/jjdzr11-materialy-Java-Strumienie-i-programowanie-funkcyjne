import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        //    Predicate<String> pred = s -> s.;
        Predicate<Integer> predicate2 = i -> i > 0;
        boolean test = predicate2.test(10);
        System.out.println("test = " + test);

        for (Integer i : numbers) {
            System.out.println("i = " + i);
            System.out.println(predicate2.test(i));
        }

    }
}
