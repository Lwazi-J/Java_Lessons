/*In Java, parameters and local variables are two different concepts related to variable declaration and usage within a method or function. Let's understand each concept separately and provide some program examples.

Parameters:
Parameters are variables that are declared within the parentheses of a method or function declaration. They represent the values that can be passed to the method when it is invoked. Parameters allow you to pass data into a method, enabling the method to perform operations on that data.
Here's an example of a method with parameters*/

public class Calculator {
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Sum: " + result);
    }
}


/*In the above example, the add method takes two parameters (num1 and num2) of type int. The method adds the values of these parameters and stores the result in a local variable called sum. Finally, the method returns the sum value.

When invoking the add method in the main method, we pass the values 5 and 3 as arguments for the num1 and num2 parameters, respectively.*/
