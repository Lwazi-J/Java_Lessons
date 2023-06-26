/* Perform the following steps:
 *
 * Create a Consumer  called  integerConsumer  which accepts
 * the Integer 35  and prints it to the console. */



import java.util.function.Consumer;

public class MainCons {
    public static void main(String[] args) {
        // Create a Consumer that prints the accepted Integer
        Consumer<Integer> integerConsumer = num -> System.out.println(num);

        // Use the Consumer to accept and print the Integer
        integerConsumer.accept(35);
    }
}

