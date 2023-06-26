Use and to combine age and gender filtering.

In this updated example, we define two predicates: agePredicate, which checks if a person's age is greater than 50, and genderPredicate, which checks if a person's gender is Gender.FEMALE. 
We then use the and() method to combine these predicates into a single combinedPredicate.

The combinedPredicate represents the filtering condition that requires both the age and gender conditions to be true. 
We apply this combined predicate to filter the collection of persons using the filterPersons() method.

The filtered persons that match the combined filtering conditions are stored in the filteredPersons list, and we iterate over this list to print the information of each person.

Note that in this example, we ensure that there is at least one person who satisfies both the age and gender conditions by adding an Emily Davis object with an age of 60 and gender Gender.FEMALE to the collection of persons.
