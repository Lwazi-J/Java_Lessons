public class MyLambda implements MyInterface {
    @Override
    public void testingLambda() {
        MyInterface myLambda = () -> System.out.println("Implementation complete");
        myLambda.testingLambda();
    }
}

