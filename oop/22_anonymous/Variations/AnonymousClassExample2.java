/* Example 2: Anonymous Class Extending a Class */


class MyBaseClass {
    void displayMessage() {
        System.out.println("This is the base class.");
    }
}

public class AnonymousClassExample2 {
    public static void main(String[] args) {
        MyBaseClass myObj = new MyBaseClass() {
            void displayMessage() {
                System.out.println("This is the anonymous class.");
            }
        };

        myObj.displayMessage();
    }
}


/* Explanation: In this example, an anonymous class is created by extending the MyBaseClass. 
 * The anonymous class overrides the displayMessage() method and provides its own implementation. 
 * The myObj variable is assigned an instance of the anonymous class, and when the displayMessage() method is called, it executes the overridden implementation. */
