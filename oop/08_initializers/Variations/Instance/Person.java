public class Person {
    private String name;
    private int age;

    // Instance initializer
    {
        // This code block will be executed for each instance of the class
        System.out.println("Instance initializer is invoked");

        // Initializing instance variables
        name = "John Doe";
        age = 25;
    }

    // Constructor
    public Person() {
        // This constructor will be invoked after the instance initializer
        System.out.println("Constructor is invoked");
    }
}
