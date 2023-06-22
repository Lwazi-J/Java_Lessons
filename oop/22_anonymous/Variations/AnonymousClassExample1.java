/* Example 1: Anonymous Class Implementing an Interface */


interface MyInterface {
    void doSomething();
}

public class AnonymousClassExample1 {
    public static void main(String[] args) {
        MyInterface myObj = new MyInterface() {
            public void doSomething() {
                System.out.println("Doing something in the anonymous class.");
            }
        };

        myObj.doSomething();
    }
}


/* Explanation: 
 * In this example, an anonymous class is created and assigned to the myObj variable, which implements the MyInterface interface. 
 * The anonymous class provides its own implementation for the doSomething() method. */


