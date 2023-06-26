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

        // Create a predicate to filter persons based on age and gender
        Predicate<Person> agePredicate = person -> person.getAge() > 50;
        Predicate<Person> genderPredicate = person -> person.getGender() == Gender.FEMALE;
        Predicate<Person> combinedPredicate = agePredicate.and(genderPredicate);

        // Filter the collection using the combined predicate
        List<Person> filteredPersons = filterPersons(persons, combinedPredicate);

        // Print the information of each person matching the combined filtering conditions
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
