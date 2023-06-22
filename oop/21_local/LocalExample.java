public class LocalExample {
    private int outerField = 10;

    public void someMethod() {
        final int localVar = 5;

        class LocalClass {
            public void printValues() {
                System.out.println("OuterField: " + outerField);
                System.out.println("LocalVar: " + localVar);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.printValues();
    }
}


/* In the example above, the LocalClass is a local class defined within the someMethod() of the OuterClass. 
 * It can access the outerField of the enclosing class and the localVar of the method. */
