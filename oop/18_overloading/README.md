In Java, both overloading and overriding are important concepts related to methods in object-oriented programming:

Method Overloading:
Method overloading allows defining multiple methods with the same name but different parameters within the same class. 
It provides a way to create methods that perform similar tasks but with different inputs or behaviors. 
Overloaded methods must have different parameter lists (number, types, or order of parameters).


Key characteristics of method overloading:

* Same method name but different parameters.
* Can have different return types, but it's not the differentiating factor.
* Occurs within the same class.
* The compiler determines which method to call based on the method arguments at compile-time.

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}




Method Overriding:
Method overriding occurs when a subclass provides a different implementation of a method that is already defined in its superclass. 
It allows a subclass to define its specific behavior for an inherited method. 
The method signature (name, parameters, and return type) must be exactly the same in the superclass and subclass.


Key characteristics of method overriding:

* Same method name, parameters, and return type.
* Occurs between a subclass and its superclass (inheritance relationship).
* The subclass provides its implementation of the method.
* The method in the subclass must have the same access modifier or a more accessible modifier.
* The @Override annotation is optional but recommended for clarity and to catch potential mistakes.


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

