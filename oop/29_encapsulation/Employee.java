/* Write your own class where in you will use private and protected
 * to demosntrate encapsulation. 
 * The class does not need a main method. */

public class Employee {
    private String name;
    private int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected double getSalary() {
        return salary;
    }

    protected void increaseSalary(double amount) {
        salary += amount;
    }
}


/* In the above Employee class:
 * The name and age variables are declared as private. 
 * This means they can only be accessed within the same class and not directly from outside the class. 
 * To access these private variables, public getter methods getName() and getAge() are provided, which allow read-only access to the private data.
 * The salary variable is declared as protected. 
 * This means it can be accessed within the same class, derived classes (subclasses), and classes within the same package. 
 * A protected getter method getSalary() is provided to allow read-only access to the salary variable. 
 * Additionally, a protected method increaseSalary() is provided to allow derived classes to modify the salary variable. */

