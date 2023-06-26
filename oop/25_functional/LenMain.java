/* Perform the following steps:
 *
 * Create a Function  called  lengthFinderFunction  whose apply takes a string
 * “FunctionLength”  and returns an int  representing the length of the string. */

import java.util.function.Function;

public class LenMain {
    public static void main(String[] args) {
        // Create a Function that returns the length of the input string
        Function<String, Integer> lengthFinderFunction = str -> str.length();

        // Apply the Function to the string "FunctionLength" and get the length
        int length = lengthFinderFunction.apply("FunctionLength");
        System.out.println(length);
    }
}

