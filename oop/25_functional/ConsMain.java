/* Perform the following steps:
 *
 * Create a Consumer  called  stringConsumer  which accepts
 * the string “I am a consumer”  and prints it to the console. */

import java.util.function.Consumer;

public class ConsMain {
    public static void main(String[] args) {
        // Create a Consumer that prints the accepted string
        Consumer<String> stringConsumer = str -> System.out.println(str);

        // Use the Consumer to accept and print the string
        stringConsumer.accept("I am a consumer");
    }
}

