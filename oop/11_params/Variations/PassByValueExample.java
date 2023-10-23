/*In Java, arguments are passed to methods using a mechanism called "pass by value." 
Understanding pass by value is important because it determines how changes to variables within a method affect the original values passed as arguments.

In pass by value, a copy of the value of an argument is passed to the method. 
This means that modifications made to the parameter within the method do not affect the original argument outside the method. 
Java passes the value of the variable, not the variable itself.

Let's see some examples to illustrate pass by value in Java:

Example 1: Passing primitive data types (int)*/

public class PassByValueExample {
    public static void modifyValue(int value) {
        value = 10;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before modification: " + num);
        modifyValue(num);
        System.out.println("After modification: " + num);
    }
}


/* In the above example, the modifyValue method takes an int parameter called value. Inside the method, 
we assign a new value of 10 to the value parameter. 
However, when we invoke the modifyValue method in the main method and pass the num variable as an argument, 
the original value of num remains unchanged. 
This demonstrates that modifications made to the parameter within the method do not affect the original argument.*/
