//Passing objects (reference types)

public class PassByValueObj {
    public static void modifyPersonName(Person person) {
        person.setName("John");
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before modification: " + person.getName());
        modifyPersonName(person);
        System.out.println("After modification: " + person.getName());
    }
}


/*In this example, we have a Person class with a name property and getter/setter methods. 
 * The modifyPersonName method takes a Person object as a parameter and modifies its name by calling the setName method. 
 * When we invoke the modifyPersonName method and pass the person object as an argument, the original person object is affected because objects are passed by value of their reference.*/
