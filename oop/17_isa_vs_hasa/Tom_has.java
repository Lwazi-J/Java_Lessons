/* The following classes are not related to each other. Change one them so that they display a has a relationship.
 * Tom.java
 * public class Tom{
 *
 * }
 *
 * Mary.java
 * public class Mary{
 *
 * } */


public class Tom {
   private Mary mary;

   public Tom() {
      mary = new Mary();
   }

   // Other methods and behaviors of the Tom class
}


/* In this modification, the Tom class now has a private instance variable mary of type Mary. 
 * It is initialized in the constructor, creating an instance of the Mary class. 
 * This establishes a "has-a" relationship where an instance of the Tom class contains an instance of the Mary class. 
 * Now, the Tom class can utilize the behavior and attributes of the Mary class through the mary instance variable. */
