/* Perform the following steps:
 *
 * Create a Predicate  called  stringColorTester  which test the string “brown”
 * to see if it is equal to “blue” and prints the result  to the console. */


import java.util.function.Predicate;

public class ColMain {
    public static void main(String[] args) {
        // Create a Predicate that tests if the string is equal to "blue"
        Predicate<String> stringColorTester = str -> str.equals("blue");

        // Test the string "brown" using the Predicate and print the result
        boolean result = stringColorTester.test("brown");
        System.out.println(result);
    }
}

