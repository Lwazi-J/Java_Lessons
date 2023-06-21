/* Static nested classes: 
 * These are static classes that are defined inside another class. 
 * They can access only static members (variables and methods) of the enclosing class. 
 * To create an instance of a static nested class, you don't need an instance of the enclosing class. 
 * Static nested classes are typically used to group related classes together.
 *
 * Here's an example of a static nested class: */

public class OuterClass {
    private static int outerStaticVar = 10;

    static class NestedClass {
        private int nestedVar = 20;

        public void printVars() {
            System.out.println("Outer static variable: " + outerStaticVar);
            System.out.println("Nested variable: " + nestedVar);
        }
    }
}

/* To use the static nested class:
 * OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
 * nestedObj.printVars(); */
