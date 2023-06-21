/* Local classes: 
 * These are classes that are defined inside a block, such as a method or a scope within a method. 
 * Local classes are only accessible within the block in which they are defined. 
 * They can access all members of the enclosing class and also local variables that are effectively final (variables whose values don't change after initialization).
 *
 * Here's an example of a local class: */


public class OuterClass2 {
    private int outerVar = 10;

    public void createLocalClass() {
        int localVar = 20;

        class LocalClass {
            public void printVars() {
                System.out.println("Outer variable: " + outerVar);
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.printVars();
    }
}


/*To use the local class:
 * OuterClass outerObj = new OuterClass();
 * outerObj.createLocalClass(); */
