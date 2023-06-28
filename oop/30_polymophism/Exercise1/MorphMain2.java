/* Create a main Class name MorphMain2.
 * Create an instance of EnglishBook in the main method assign it to a variable name inst1.
 * Create a variable name target assign the instance of EnglishBook to it. */

public class MorphMain2 {
    public static void main(String[] args) {
        EnglishBook inst1 = new EnglishBook();  // Creating an instance of EnglishBook and assigning it to inst1

        Book target = inst1;  // Assigning the instance of EnglishBook to the variable target
    }
}


/* In the main method, we create an instance of EnglishBook named inst1. 
 * Then, we declare a variable target of type Book and assign the instance of EnglishBook (inst1) to it. 
 * Since EnglishBook is a subclass of Book, it can be assigned to a variable of type Book. 
 * This demonstrates polymorphism, where an object of a derived class (EnglishBook) can be treated as an object of its superclass (Book). */
