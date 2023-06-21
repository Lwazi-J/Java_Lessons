public class OuterClass {
    private static int outerStaticVar = 10;

    static class NestedClass {
        private int nestedVar = 20;

        public void printVars() {
            System.out.println("Outer static variable: " + outerStaticVar);
            System.out.println("Nested variable: " + nestedVar);
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
        nestedObj.printVars();
    }
}


/* Static Nested Class:
 * The OuterClass defines a static nested class called NestedClass.
 * The NestedClass has its own variable nestedVar and a method printVars() that prints both the outer static variable outerStaticVar and the nested variable.
 * In the main() method, an instance of NestedClass is created using the syntax OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();.
 * The printVars() method is called on the nestedObj instance to display the values of the variables. */
