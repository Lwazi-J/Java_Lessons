/* Example 4: Using a Supplier */

import java.util.function.Supplier;

public class MainSup {
    public static void main(String[] args) {
        Supplier<String> greetingSupplier = () -> "Hello, World!";

        System.out.println(greetingSupplier.get());  // Output: Hello, World!
    }
}

