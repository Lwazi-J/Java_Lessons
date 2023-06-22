/* Write a java class with the following. 
 * You can name the class whatever you like:
 *
 * void method.
 * constructor
 * static instance initializer.
 * instance initializer.
 * an ordinary block within the method. */

public class MyClass {
    // Instance variable
    private int instanceVariable;

    // Constructor
    public MyClass() {
        System.out.println("Constructor called");
        instanceVariable = 10;
    }

    // Static instance initializer
    static {
        System.out.println("Static instance initializer");
    }

    // Instance initializer
    {
        System.out.println("Instance initializer");
    }

    // Method
    public void myMethod() {
        System.out.println("Method called");

        // Ordinary block within the method
        {
            int localVariable = 5;
            System.out.println("Local variable inside the ordinary block: " + localVariable);
        }
    }
}



