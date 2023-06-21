public class OuterClas3 {
    public void createAnonymousClass() {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Anonymous class is running.");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.createAnonymousClass();
    }
}


/* Anonymous Class:
 * The OuterClass has a method called createAnonymousClass().
 * Inside this method, an anonymous class that implements the Runnable interface is created.
 * The anonymous class overrides the run() method of the Runnable interface to print a message.
 * An instance of the anonymous class is assigned to the Runnable reference variable runnable.
 * A Thread is created using the runnable object, and the start() method is called to execute the overridden run() method.
 * In the main() method, an instance of OuterClass is created as outerObj, and the createAnonymousClass() method is invoked on it. */
