/* Example 1: Creating and Discarding Objects */

public class GarbageCollectionExample1 {
    public static void main(String[] args) {
        // Creating objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Discarding objects by setting references to null
        obj1 = null;
        obj2 = null;

        // Perform garbage collection (optional)
        System.gc();
    }
}

class MyClass {
    // Class implementation
}


/* In this example, two MyClass objects are created and assigned to variables obj1 and obj2. 
 * Afterward, the references to these objects are set to null, making them unreachable. 
 * Finally, System.gc() is called to suggest garbage collection. 
 * However, note that the JVM may or may not immediately initiate garbage collection in response to this call */


