/* Use the or method to apply logical or between two predicates. */

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s.startsWith("Hello");
        Predicate<String> predicate2 = s -> s.endsWith("World");

        Predicate<String> combinedPredicate = predicate1.or(predicate2);

        System.out.println(combinedPredicate.test("Hello, World!")); // Output: true
        System.out.println(combinedPredicate.test("Goodbye, World!")); // Output: true
        System.out.println(combinedPredicate.test("Hello")); // Output: true
        System.out.println(combinedPredicate.test("World")); // Output: true
        System.out.println(combinedPredicate.test("OpenAI")); // Output: false
    }
}

