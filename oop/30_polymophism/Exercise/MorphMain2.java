/* Change the above program such that you re-assign the instance of target back to inst1.
 * Hint you need to cast in order to achieve this. */ 

public class MorphMain2 {
    public static void main(String[] args) {
        Morph1 morph1 = new Morph1();  // Creating an instance of Morph1 named morph1
        
        Object target = null;  // Creating a variable called target of type Object and initializing it to null
        
        target = morph1;  // Assigning the instance of Morph1 to the variable target
        
        Morph1 morph2 = (Morph1) target;  // Reassigning the instance of target back to morph1 using casting
    }
}

/* In the modified code, after assigning morph1 to target, we create a new variable morph2 of type Morph1. 
 * We use casting (Morph1) to cast the value of target back to its original type Morph1 and assign it to morph2. 
 * Now, morph2 holds the same instance of Morph1 as morph1. */


