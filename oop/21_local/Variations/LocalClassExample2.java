//Example 2: Local Class Accessing Local Variables


public class LocalClassExample2 {
    public void performOperation() {
        int x = 10; // Local variable

        class LocalClass {
            void displayValue() {
                System.out.println("The value of x is: " + x);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.displayValue();
    }

    public static void main(String[] args) {
        LocalClassExample2 example = new LocalClassExample2();
        example.performOperation();
    }
}

/* Explanation: 
 * In this example, the local class LocalClass accesses the local variable x from the enclosing method. 
 * The value of x is captured by the local class and used in its displayValue() method. */

