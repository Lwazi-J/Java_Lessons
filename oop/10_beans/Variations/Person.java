import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
        // Default constructor
    }

    // Getter and setter methods for the "name" property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for the "age" property
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

