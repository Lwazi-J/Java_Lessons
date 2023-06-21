/* Inner classes: 
 * These are non-static classes that are defined inside another class. 
 * Inner classes have access to all members of the enclosing class, including static and instance variables and methods. 
 * An instance of an inner class is always associated with an instance of the enclosing class.
 *
 * Here's an example of an inner class: */

public class OuterClass1 {
    private int outerVar = 10;

    class InnerClass {
        private int innerVar = 20;

        public void printVars() {
            System.out.println("Outer variable: " + outerVar);
            System.out.println("Inner variable: " + innerVar);
        }
    }
}


/* To use the inner class:
 * OuterClass outerObj = new OuterClass();
 * OuterClass.InnerClass innerObj = outerObj.new InnerClass();
 * innerObj.printVars(); */
