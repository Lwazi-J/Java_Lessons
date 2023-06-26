/* Make use of lambda expressions for the below exercise
 * Perform the following steps:
 *
 * Create a functional interface called MyInterface
 * Annotate your interface with the @FunctionalInterface annotation */

@FunctionalInterface
interface MyInterface {
    void myMethod();
}

public class MainTest {
    public static void main(String[] args) {
        // Create a lambda expression to implement the abstract method of MyInterface
        MyInterface myLambda = () -> {
            System.out.println("Hello from lambda expression!");
        };

        // Call the method defined in the functional interface using the lambda expression
        myLambda.myMethod();
    }
}


