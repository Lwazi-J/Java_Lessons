/*  Modify your code by adding a second abstract method. Does it compile ? */ 

@FunctionalInterface
interface MyInterface {
    void myMethod();

    // Attempting to add a second abstract method
    void anotherMethod();
}

public class MainTest2 {
    public static void main(String[] args) {
        // Code omitted for brevity
    }
}

/* The error message indicates that MyInterface is not considered a functional interface
 * because it has multiple non-overriding abstract methods. */
