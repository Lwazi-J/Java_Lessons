/* Negate by city i.e. Not in London */

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

        // Create a predicate to filter persons not in London
        Predicate<Person> notInLondonPredicate = person -> person.getCity() != City.LONDON;

        // Filter the collection using the negated predicate
        List<Person> filteredPersons = filterPersons(persons, notInLondonPredicate);

        // Print the information of each person not in London
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

/* In this updated example, we create a Predicate called notInLondonPredicate, which checks if a person's city is not equal to City.LONDON. 
 * We then apply the negate() method to this predicate to create a negated predicate.
 * The negated predicate represents the filtering condition that requires a person's city to not be London. 
 * We apply this negated predicate to filter the collection of persons using the filterPersons() method.
 * The filtered persons, who are not in London, are stored in the filteredPersons list, and we iterate over this list to print the information of each person.
 * Note that in this example, we ensure that there is at least one person who is not in London by adding an Alex Johnson object with the city City.PARIS to the collection of persons.*/
