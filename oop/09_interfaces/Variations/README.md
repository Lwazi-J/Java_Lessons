In Java, an interface is a reference type that defines a contract or a set of method signatures without providing their implementation details. It serves as a blueprint for classes to follow and ensures that classes implementing the interface adhere to a specific behavior.

In this example, the Drawable interface declares a single method called draw() without specifying its implementation. Any class that implements the Drawable interface must provide an implementation for the draw() method.

In this example, the Circle class implements the Drawable interface and provides an implementation for the draw() method. The @Override annotation indicates that the draw() method is overriding the method defined in the interface.

When you run the Main class, it will output: "Drawing a circle with radius: 5". The draw() method of the Circle class is invoked, demonstrating how the implementation of the interface method is used.

Interfaces are useful in Java for achieving abstraction, defining common behavior, and facilitating code reuse. They allow for polymorphism and enable loose coupling between classes. Other classes can implement the same interface, providing their own implementations for the defined methods, allowing for interchangeable usage.
