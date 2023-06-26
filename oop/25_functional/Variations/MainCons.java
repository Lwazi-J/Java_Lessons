/* Example 2: Using a Consumer */

import java.util.function.Consumer;

public class MainCons {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        printUpperCase.accept("hello");  // Output: HELLO
        printUpperCase.accept("world");  // Output: WORLD
    }
}

