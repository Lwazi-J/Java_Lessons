/* Anonymous classes: 
 * These are classes that are defined and instantiated simultaneously, without a explicit class name. 
 * They are often used when you need to create a one-time implementation of an interface or an abstract class.
 *
 * Here's an example of an anonymous class: */

public class OuterClass3 {
    public void createAnonymousClass() {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Anonymous class is running.");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}


/*To use the anonymous class:
 * OuterClass outerObj = new OuterClass();
 * outerObj.createAnonymousClass(); */
