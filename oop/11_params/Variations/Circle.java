/*Local Variables:
Local variables are variables that are declared within a method, constructor, or block of code. They have a limited scope and are only accessible within the block where they are declared. Local variables are used to store temporary data or intermediate results within a method.
Here's an example that demonstrates local variables*/

public class Circle {
    public static double calculateArea(double radius) {
        double pi = 3.14159;
        double area = pi * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double circleArea = calculateArea(radius);
        System.out.println("Area of the circle: " + circleArea);
    }
}


/*In the above example, the calculateArea method takes a parameter called radius of type double. Within the method, there are two local variables: pi, which stores the value of pi (approximately 3.14159), and area, which stores the calculated area of the circle.

In the main method, we declare a local variable called radius and assign it a value of 5.0. We then invoke the calculateArea method, passing the radius variable as an argument. The returned value is stored in the circleArea variable, which is then printed to the console.*/
