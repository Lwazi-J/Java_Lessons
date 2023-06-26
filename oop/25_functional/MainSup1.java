/* Perform the following steps:
 *
 * Create an IntSupplier  called  inPrimitiveSupplier
 * which gets the int  47  and prints it to the console. */

import java.util.function.IntSupplier;

public class MainSup1 {
    public static void main(String[] args) {
        // Create an IntSupplier that returns the int value 47
        IntSupplier inPrimitiveSupplier = () -> 47;

        // Use the IntSupplier to get the int value and print it to the console
        System.out.println(inPrimitiveSupplier.getAsInt());
    }
}

