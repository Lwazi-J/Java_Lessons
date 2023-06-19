In Java, access specifiers are keywords used to define the accessibility or visibility of classes, methods, variables, and constructors. 
There are four

public: The public access specifier allows the class, method, or variable to be accessible from anywhere, both within and outside the class or package.

private: The private access specifier restricts the visibility of a class member (method, variable, or nested class) to only within the same class. It cannot be accessed from outside the class, including other classes in the same package.

protected: The protected access specifier allows the class member to be accessible within the same package and also in the subclass(es) of the class, even if the subclass is in a different package.

Default (no specifier): If no access specifier is specified, it is considered the default access level. The default access allows the class member to be accessible within the same package but not from outside the package.

