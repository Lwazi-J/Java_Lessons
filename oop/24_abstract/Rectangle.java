/* In the context of classes and objects */

// Concrete class
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

// Abstract class
public abstract class Shape {
    public abstract int calculateArea();
}


/* In this example, Rectangle is a concrete class that provides a complete implementation of the calculateArea method, 
 * allowing objects of the Rectangle class to be instantiated and used directly. 
 * On the other hand, Shape is an abstract class that declares the calculateArea method as an abstract method, 
 * without providing its implementation. 
 * It serves as a blueprint for other concrete shape classes (e.g., Circle, Triangle) to provide their specific implementations. */
