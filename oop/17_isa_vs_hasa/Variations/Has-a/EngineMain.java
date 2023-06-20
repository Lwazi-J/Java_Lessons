class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Starting the " + type + " engine");
    }
}

class Car {
    private Engine engine;

    public Car(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V6");
        car.startCar();
    }
}


/* In this example, we have a Car class that has a "has-a" relationship with the Engine class. 
 * The Car class contains an instance variable engine of type Engine. 
 * In the Car constructor, a specific type of engine is created and assigned to the engine variable. 
 * The Car class has a startCar() method that calls the start() method on the engine object, followed by printing "Car started" to indicate the car has started. 
 * In the main method, an instance of Car is created with a "V6" engine type, and the startCar() method is called. 
 * This results in starting the engine and printing "Car started". */
