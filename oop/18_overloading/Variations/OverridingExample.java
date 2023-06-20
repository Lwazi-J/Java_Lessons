class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound
        
        Cat cat = new Cat();
        cat.makeSound(); // Output: Cat meows
    }
}


/* In this example, the Cat class overrides the makeSound method from the Animal class to provide its own implementation. 
 * When makeSound is called on an instance of Cat, it prints "Cat meows" instead of the default message from the superclass. */
