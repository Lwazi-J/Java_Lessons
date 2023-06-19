public class MyClass {
    public String publicVar;
    private String privateVar;
    protected String protectedVar;
    String defaultVar;

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }
}

