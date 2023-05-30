public class MathCalc {
    private static final double PI;

    // Static initializer
    static {
        // This code block will be executed when the class is loaded
        System.out.println("Static initializer is invoked");

        // Initializing static variable
        PI = 3.14159;
    }
}
