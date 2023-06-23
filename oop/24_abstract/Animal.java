/* In the context of methods: */


public abstract class Animal {
    public abstract void makeSound(); // Abstract method

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}


/* In this example, the Animal class is an abstract class that declares an abstract method makeSound() without an implementation. 
 * It provides a contract for its subclasses to define the specific sounds animals make. 
 * The Dog class extends Animal and provides an implementation of the makeSound() method, making it a concrete class. */



