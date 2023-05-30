public class PersonTest {
	public static void main(String[] args) {
        // Creating two instances of the Person class
        Person person1 = new Person();
        Person person2 = new Person();

        // Setting instance variables for person1
        person1.name = "John";
        person1.age = 25;

        // Setting instance variables for person2
        person2.name = "Alice";
        person2.age = 30;

        // Invoking instance method to display information
        person1.displayInfo();
        person2.displayInfo();
    }
}
