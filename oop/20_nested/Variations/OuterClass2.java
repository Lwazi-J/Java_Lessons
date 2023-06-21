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

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.createLocalClass();
    }
}


/* Local Class:
 * The OuterClass has a method called createLocalClass().
 * Inside this method, a local class called LocalClass is defined.
 * The LocalClass has a method printVars() that prints both the outer variable outerVar and the local variable localVar.
 * Within the createLocalClass() method, an instance of LocalClass is created as localObj.
 * Finally, the printVars() method is called on the localObj instance to display the values of the variables.
 * In the main() method, an instance of OuterClass is created as outerObj, and the createLocalClass() method is invoked on it. */
