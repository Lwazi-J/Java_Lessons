/* Example 1: Simple Encapsulation with Getters and Setters */ 

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


/* In this example, the Person class encapsulates the name and age variables. 
 * The variables are declared as private, ensuring that they can only be accessed within the same class. 
 * Public getter and setter methods (getName(), setName(), getAge(), setAge()) are provided to control access to these variables. 
 * This way, the internal state of the Person object is protected, and any changes or retrievals of the data must go through the defined methods. */



