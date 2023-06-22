//Example 3: Local Class with Constructor


public class LocalClassExample3 {
    public void performOperation() {
        class LocalClass {
            private int value;

            LocalClass(int value) {
                this.value = value;
            }

            void displayValue() {
                System.out.println("The value is: " + value);
            }
        }

        LocalClass localObj = new LocalClass(42);
        localObj.displayValue();
    }

    public static void main(String[] args) {
        LocalClassExample3 example = new LocalClassExample3();
        example.performOperation();
    }
}

/* Explanation: 
 * This example showcases a local class LocalClass with a constructor. 
 * The constructor accepts an argument value which is assigned to the value field of the local class. 
 * The displayValue() method prints the stored value. 
 * An instance of the local class is created and initialized with the value 42 before calling the displayValue() method. */

