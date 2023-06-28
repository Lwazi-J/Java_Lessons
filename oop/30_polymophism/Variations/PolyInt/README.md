Example 2: Polymorphism with Interfaces

In this example, we have an interface called Shape, and two classes Circle and Rectangle that implement the Shape interface. 
Each class provides its own implementation of the draw() method defined in the Shape interface. 
In the main method, we create objects of type Circle and Rectangle, but we declare them as type Shape. 
When we call the draw() method on these objects, the corresponding implementation in each class is executed. 
This demonstrates polymorphism through interfaces, where objects of different classes that implement the same interface can be treated interchangeably based on the common interface they share.
