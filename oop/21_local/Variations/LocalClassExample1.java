//Example 1: Local Class Implementing an Interface

public class LocalClassExample1 {
    public void performOperation() {
        // Local class implementing an interface
        interface MyInterface {
            void doSomething();
        }

        class LocalClass implements MyInterface {
            @Override
            public void doSomething() {
                System.out.println("Doing something in the local class.");
            }
        }

        // Creating an instance of the local class
        LocalClass localObj = new LocalClass();
        localObj.doSomething();
    }

    public static void main(String[] args) {
        LocalClassExample1 example = new LocalClassExample1();
        example.performOperation();
    }
}


/* Explanation: 
 * In this example, the performOperation() method contains a local class LocalClass that implements the MyInterface.
 * The local class overrides the doSomething() method from the interface and provides its own implementation. 
 * Inside the method, an instance of the local class is created and its method is invoked. */


