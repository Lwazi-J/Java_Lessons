/* Perform the following steps:
 *
 * Create a Supplier  called  stringSupplier  which gets the string
 * “I am a supplier”  and prints it to the console. */

import java.util.function.Supplier;

public class MainSup {
    public static void main(String[] args) {
        // Create a Supplier that returns the string "I am a supplier"
        Supplier<String> stringSupplier = () -> "I am a supplier";

        // Use the Supplier to get the string and print it to the console
        System.out.println(stringSupplier.get());
    }
}

