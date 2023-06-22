/* Example 3: Anonymous Class with Constructor */


abstract class MyAbstractClass {
    abstract void displayMessage();
}

public class AnonymousClassExample3 {
    public static void main(String[] args) {
        MyAbstractClass myObj = new MyAbstractClass() {
            void displayMessage() {
                System.out.println("Anonymous class with constructor.");
            }
        };

        myObj.displayMessage();
    }
}


/* Explanation: 
 * This example demonstrates an anonymous class derived from the MyAbstractClass abstract class. 
 * The anonymous class provides an implementation for the displayMessage() method. 
 * When the displayMessage() method is invoked on the myObj instance, the overridden implementation in the anonymous class is executed. */
