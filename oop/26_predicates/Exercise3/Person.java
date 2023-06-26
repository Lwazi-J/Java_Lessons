class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private City city;

    public Person(String name, String surname, int age, Gender gender, City city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", city=" + city +
                '}';
    }
}
