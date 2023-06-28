Example 1: Polymorphism with Inheritance

In this example, we have an Animal class and two subclasses, Dog and Cat. Each subclass overrides the makeSound()
method of the Animal class with its own implementation. 
In the main method, we create objects of type Dog and Cat, but we declare them as type Animal. 
When we call the makeSound() method on these objects, the appropriate overridden method in each subclass is invoked. 
This demonstrates polymorphism, as the same method makeSound() is invoked, but the actual behavior depends on the type of the object at runtime.
