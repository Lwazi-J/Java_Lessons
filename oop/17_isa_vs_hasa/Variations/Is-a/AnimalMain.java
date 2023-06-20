class Animal {
    // Animal class implementation
}

class Mammal extends Animal {
    // Mammal class implementation
}

class Reptile extends Animal {
    // Reptile class implementation
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Mammal();
        System.out.println(animal instanceof Animal);   // true
        System.out.println(animal instanceof Mammal);   // true
        System.out.println(animal instanceof Reptile);  // false
    }
}


/* In this example, we have an Animal class serving as the superclass. 
 * The Mammal and Reptile classes extend the Animal class, representing an "is-a" relationship. 
 * The main method creates an instance of the Mammal class and assigns it to an Animal reference variable. 
 * The instanceof operator is used to check the type compatibility. 
 * As expected, the results indicate that the animal object is an instance of Animal and Mammal, but not Reptile. */
