/* Example 3: Using a Function */

import java.util.function.Function;

public class MainFunc {
    public static void main(String[] args) {
        Function<Integer, Integer> square = number -> number * number;

        System.out.println(square.apply(5));  // Output: 25
        System.out.println(square.apply(8));  // Output: 64
    }
}

