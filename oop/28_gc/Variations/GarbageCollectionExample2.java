/* Example 2: Object Finalization */

public class GarbageCollectionExample2 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();

        // Discard the reference to the object
        obj1 = null;

        // Perform garbage collection (optional)
        System.gc();
    }
}

class MyClass {
    // Class implementation

    @Override
    protected void finalize() throws Throwable {
        try {
            // Finalization code
            System.out.println("Finalizing MyClass object");
        } finally {
            // Call the superclass finalize() method
            super.finalize();
        }
    }
}


/* In this example, an instance of MyClass is created, and its reference is discarded by setting obj1 to null. 
 * The MyClass class overrides the finalize() method, which is called by the garbage collector before the object is garbage collected. 
 * In this method, any necessary finalization code can be executed. 
 * In this case, it prints a message before calling the super.finalize() method to perform any superclass finalization. */

