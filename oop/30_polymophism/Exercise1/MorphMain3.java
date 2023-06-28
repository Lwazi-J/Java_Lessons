/* Change the above program such that you re-assign the instance of target back to inst1.
 * Hint you need to cast in order to achieve this. */

public class MorphMain3 {
    public static void main(String[] args) {
        EnglishBook inst1 = new EnglishBook();  // Creating an instance of EnglishBook and assigning it to inst1

        Book target = inst1;  // Assigning the instance of EnglishBook to the variable target

        inst1 = (EnglishBook) target;  // Reassigning the instance of target back to inst1 using casting
    }
}


/* In the modified code, after assigning inst1 to target, we reassign the value of target back to inst1 using casting:
 *
 * inst1 = (EnglishBook) target;  // Reassigning the instance of target back to inst1 using casting
 *
 * Here, we explicitly cast the value of target to EnglishBook using (EnglishBook) before assigning it to inst1. 
 * This is an example of downcasting, as we are casting the superclass type (Book) back to the subclass type (EnglishBook). 
 * Downcasting requires an explicit cast operator to indicate the specific subclass type. */

