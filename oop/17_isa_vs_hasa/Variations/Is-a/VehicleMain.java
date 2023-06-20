class Vehicle {
    // Vehicle class implementation
}

class Car extends Vehicle {
    // Car class implementation
}

class Motorcycle extends Vehicle {
    // Motorcycle class implementation
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle instanceof Vehicle);   // true
        System.out.println(vehicle instanceof Car);       // true
        System.out.println(vehicle instanceof Motorcycle); // false
    }
}

/* In this example, we have a Vehicle class that serves as the superclass. 
 * The Car and Motorcycle classes extend the Vehicle class, indicating an "is-a" relationship. 
 * The main method creates an instance of the Car class and assigns it to a Vehicle reference variable. 
 * The instanceof operator is then used to check the type compatibility. 
 * Since the Car class is a subclass of Vehicle, the results indicate that the vehicle object is an instance of Vehicle and Car, but not Motorcycle. */
