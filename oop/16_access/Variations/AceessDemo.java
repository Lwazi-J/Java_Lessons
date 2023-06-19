public class AccessDemo {
    public static void main(String[] args) {
        // Create an instance of the MyClass class
        MyClass myObj = new MyClass();

        // Accessing public members
        myObj.publicVar = "Public Variable";
        myObj.publicMethod();

        // Accessing private members - Compilation error: privateVar has private access in MyClass
        // myObj.privateVar = "Private Variable";
        // myObj.privateMethod();

        // Accessing protected members - Compilation error: protectedVar has protected access in MyClass
        // myObj.protectedVar = "Protected Variable";
        // myObj.protectedMethod();

        // Accessing default members - Compilation error: defaultVar has default access in MyClass
        // myObj.defaultVar = "Default Variable";
        // myObj.defaultMethod();
    }
}

