/* Perform the following steps:
 *
 * Create a IntConsumer  called  intPrimitiveConsumer  
 * which gets the int 94  and prints it to the console. */



import java.util.function.IntConsumer;

public class MainCons1 {
    public static void main(String[] args) {
        // Create an IntConsumer that prints the accepted int
        IntConsumer intPrimitiveConsumer = num -> System.out.println(num);

        // Use the IntConsumer to accept and print the int
        intPrimitiveConsumer.accept(94);
    }
}

