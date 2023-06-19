public class ObjectExample {
    public static void main(String[] args) {
        Object obj1 = new Object(); // Creating an instance of Object class

        // toString() method
        System.out.println(obj1.toString()); // Output: java.lang.Object@<hexadecimal representation>

        // equals() method
        Object obj2 = new Object();
        Object obj3 = obj2;
        System.out.println(obj2.equals(obj3)); // Output: true

        // hashCode() method
        System.out.println(obj1.hashCode()); // Output: Some unique integer value

        // getClass() method
        System.out.println(obj1.getClass()); // Output: class java.lang.Object
    }
}


/* output
 *
 * java.lang.Object@7fad8c79
 * true
 *2142080121
 *class java.lang.Object */


/* In the above example:

 * We create an instance of the Object class using the new keyword.
 * The toString() method is called on obj1 to obtain a string representation of the object. 
 * By default, it returns the class name followed by the @ symbol and a hexadecimal representation of the object's memory address.
 * The equals() method is used to compare obj2 and obj3 for equality. 
 * Since obj3 is referencing the same object as obj2, the result is true.
 * The hashCode() method returns a unique hash code value for the object. 
 * The specific value depends on the implementation and may vary between different executions of the program.
 * The getClass() method returns the runtime class of the object, which in this case is java.lang.Object. */
