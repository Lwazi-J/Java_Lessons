import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> greaterThanFive = num -> num > 5;
        Predicate<Integer> evenNumber = num -> num % 2 == 0;

        // Combining predicates using logical OR
        Predicate<Integer> combinedPredicate = greaterThanFive.or(evenNumber);

        // Filtering the list using the combined predicate
        List<Integer> filteredNumbers = filterList(numbers, combinedPredicate);

        System.out.println(filteredNumbers); // Output: [2, 4, 6, 7, 8, 9, 10]
    }

    public static List<Integer> filterList(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();

        for (Integer item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }
}



/* In this example, we have two predicates: greaterThanFive, which checks if a number is greater than 5, and evenNumber, which checks if a number is even.
 * We then use the or() method to combine these two predicates into a new predicate called combinedPredicate, representing the logical OR between them.
 * Finally, we use the combinedPredicate to filter the list of numbers, resulting in a new list that contains numbers that are either greater than 5 or even.
 * By using the or() method, you can create complex predicates by combining multiple conditions using logical OR operations.*/
