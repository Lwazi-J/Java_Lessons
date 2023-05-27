/*In certain cases you want to pass in values to you constructor so that it uses them to construct the object.
 * Below is an example of a constructor that accepts a parameter*/

public class Constructor2 {
    public Constructor2(String name) {
        System.out.println(“Constructing Name:”+name);
    }
}

public class ConstructorTest_2 {
    public static void main(String[] args) {
 	   new Constructor2(“Peter”);
    }
}


