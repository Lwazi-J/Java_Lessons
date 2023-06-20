class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void display() {
        System.out.println("Address: " + street + ", " + city + ", " + state);
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        address.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Cityville", "State");
        Person person = new Person("John Doe", address);
        person.displayInfo();
    }
}


/* In this example, we have a Person class that has a "has-a" relationship with the Address class. 
 * The Person class contains an instance variable address of type Address. 
 * In the Person constructor, an Address object is passed and assigned to the address variable. 
 * The Person class has a displayInfo() method that displays the person's name and calls the display() method on the address object to display the person's address. 
 * In the main method, an Address object is created, and a Person object is created with a name and the address object. 
 * The displayInfo() method is called on the person object, resulting in displaying the person's name and address. */
