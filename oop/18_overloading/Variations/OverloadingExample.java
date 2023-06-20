class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int result1 = calculator.add(5, 10);
        System.out.println("Result1: " + result1); // Output: Result1: 15
        
        double result2 = calculator.add(3.5, 2.5);
        System.out.println("Result2: " + result2); // Output: Result2: 6.0
    }
}



/* In this example, the Calculator class demonstrates method overloading. 
 * It defines two add methods with different parameter types (integers and doubles). 
 * When add is called with integers, the corresponding method is executed, and when it is called with doubles, the appropriate method is invoked. 
 * This allows for flexibility in accepting different types of inputs while performing addition. */
