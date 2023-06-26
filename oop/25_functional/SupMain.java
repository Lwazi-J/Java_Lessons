/* Perform the following steps:
 *
 * Create a Supplier  called  integerSupplier  which gets the
 * Integer 100  and prints it to the console */ 

import java.util.function.Supplier;

public class SupMain {
    public static void main(String[] args) {
        // Create a Supplier that returns the Integer 100
        Supplier<Integer> integerSupplier = () -> 100;

        // Use the Supplier to get the Integer value and print it to the console
        System.out.println(integerSupplier.get());
    }
}

