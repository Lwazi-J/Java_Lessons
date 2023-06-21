OOP 16.1 Nested Classes

Nested classes, also known as inner classes, are classes that are defined within another class. 
In Java, a nested class can be declared as a member of another class, and it has access to the members (variables, methods, etc.) of its enclosing class.

Nested classes in Java offer several benefits:

Encapsulation and Organization: 
Nested classes allow you to logically group related classes together. 
By placing classes within the scope of another class, you can encapsulate them and restrict their visibility to the outer class and its members. 
This improves code organization and enhances code maintainability.

Increased Readability: 
Nesting classes can make the code more readable, especially when the nested class is closely related to its enclosing class. 
It conveys the intent that the nested class is closely tied to the outer class and helps to reduce clutter in the codebase.

Enhanced Accessibility: 
Nested classes have access to the private members of their enclosing class. 
This allows for better information hiding and encapsulation. 
Conversely, the outer class can access the members of the nested class, providing bidirectional access.

Implementation of Complex Data Structures: 
Nested classes can be used to implement complex data structures by creating classes specifically designed to work together. 
This promotes a more intuitive and modular design.




There are four types of nested classes in Java:


Static nested classes: 
These are static classes that are defined within another class. 
They can access only static members of the enclosing class and do not require an instance of the outer class to be instantiated.

Inner classes: 
These are non-static nested classes that have access to all members of the enclosing class, including static and instance variables and methods. 
Inner classes are associated with an instance of the outer class.

Local classes: 
These are classes that are defined within a block, typically a method or a scope within a method. 
Local classes have access to all members of the enclosing class and local variables that are effectively final.

Anonymous classes: 
These are classes that are declared and instantiated simultaneously without a named class. 
They are typically used for one-time implementations of interfaces or abstract classes.




By utilizing nested classes effectively, you can create more modular and maintainable code structures in Java.
