/* Use or for two age or gender.*/


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

        // Create a predicate to filter persons based on age or gender
        Predicate<Person> agePredicate = person -> person.getAge() > 50;
        Predicate<Person> genderPredicate = person -> person.getGender() == Gender.FEMALE;
        Predicate<Person> combinedPredicate = agePredicate.or(genderPredicate);

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

/* In this updated example, we define two predicates: agePredicate, which checks if a person's age is greater than 50, and genderPredicate, which checks if a person's gender is Gender.FEMALE. 
 * We then use the or() method to combine these predicates into a single combinedPredicate.
 *

 * The combinedPredicate represents the filtering condition that requires either the age condition or the gender condition to be true. 
 * We apply this combined predicate to filter the collection of persons using the filterPersons() method.
 * 
 * The filtered persons that match either the age or gender conditions are stored in the filteredPersons list, and we iterate over this list to print the information of each person.
 * 
 * Note that in this example, we ensure that there is at least one person who satisfies either the age or gender condition by adding an Emily Davis object with an age of 60 and gender Gender.FEMALE to the collection of persons.*/
