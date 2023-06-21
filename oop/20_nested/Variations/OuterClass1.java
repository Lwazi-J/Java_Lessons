public class OuterClass1 {
    private int outerVar = 10;

    class InnerClass {
        private int innerVar = 20;

        public void printVars() {
            System.out.println("Outer variable: " + outerVar);
            System.out.println("Inner variable: " + innerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.printVars();
    }
}


/* Inner Class:
 * The OuterClass defines an inner class called InnerClass.
 * The InnerClass has its own variable innerVar and a method printVars() that prints both the outer variable outerVar and the inner variable.
 * In the main() method, an instance of OuterClass is created as outerObj.
 * Then, an instance of InnerClass is created using the syntax OuterClass.InnerClass innerObj = outerObj.new InnerClass();.
 * Finally, the printVars() method is called on the innerObj instance to display the values of the variables. */
