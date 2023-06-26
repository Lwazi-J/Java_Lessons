import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonExample {
    public static void main(String[] args) {
        // Create a collection of persons
        List<Person> persons = new ArrayList<>();

        // Add persons with varying attributes
        persons.add(new Person("John", "Doe", 25, Gender.MALE, City.NEW_YORK));
        persons.add(new Person("Jane", "Smith", 30, Gender.FEMALE, City.LONDON));
        persons.add(new Person("Alex", "Johnson", 40, Gender.MALE, City.PARIS));
        persons.add(new Person("Emily", "Davis", 60, Gender.FEMALE, City.NEW_YORK));

        // Create a predicate to filter persons of a specific gender
        Predicate<Person> femalePredicate = person -> person.getGender() == Gender.FEMALE;

        // Filter the collection using the predicate
        List<Person> filteredPersons = filterPersons(persons, femalePredicate);

        // Print the information of each person of the specified gender
        for (Person person : filteredPersons) {
            System.out.println(person);
        }
    }

    public static List<Person> filterPersons(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredList = new ArrayList<>();

        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredList.add(person);
            }
        }

        return filteredList;
    }
}
