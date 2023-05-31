class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*In the above example, although we pass the person object by value, both the original and the parameter refer to the same object in memory. Therefore, changes made to the object's state (name) within the method are reflected in the original object.*/
