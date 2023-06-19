class CarTest {
	public static void main (String[] args) {
        	Car car1 = new Car("Toyota", "Camry", 2021);
        	Car car2 = new Car("Toyota", "Camry", 2021);

        	// toString() method
        	System.out.println(car1.toString()); // Output: Car{make='Toyota', model='Camry', year=2021}

        	// equals() method
        	System.out.println(car1.equals(car2)); // Output: true

        	// hashCode() method
        	System.out.println(car1.hashCode()); // Output: Some unique integer value

        	// getClass() method
        	System.out.println(car1.getClass()); // Output: class Car
    	}
}


/* OUTPUT
 *
 * Car{make='Toyota', model='Camry', year=2021}
 * true
 * 1382157837
 * class Car */ 


/* In this example:

 * We have a Car class that represents a car object with properties like make, model, and year. 
 * The class overrides the toString(), equals(), and hashCode() methods inherited from java.lang.Object.
 * The toString() method is overridden to provide a custom string representation of a car object.
 * The equals() method is overridden to compare two Car objects based on their make, model, and year properties.
 * The hashCode() method is overridden to generate a hash code value for a Car object based on its make, model, and year properties.
 * In the main() method, we create two Car objects car1 and car2 with the same make, model, and year values.
 * We then invoke the toString(), equals(), hashCode(), and getClass() methods on car1 to demonstrate their behavior.
 *Keep in mind that the toString(), equals(), and hashCode() methods can be overridden in any class to provide custom behavior based on the specific requirements of the class. */
