Use a predicate to filter for all people of a specific gender. 
Make sure that at least one person from the gender is filtered for.


In this updated example, we introduce a Predicate called femalePredicate, which checks if a person's gender is Gender.FEMALE. 
We then apply this predicate to filter the collection of persons using the filterPersons() method.

The filtered persons, who are of the specified gender, are stored in the filteredPersons list, and we iterate over this list to print the information of each person.

Note that in this example, we ensure that there is at least one person of the specified gender by adding a Jane Smith object with the gender Gender.FEMALE to the collection of persons.
