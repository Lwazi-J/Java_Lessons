An abstract class has the word abstract in the class definition and an abstract method has the word abstract at the beginning too. The example below is an example of an abstract class.

public abstract class AbstractTest {
	public void doConcrete1(){
		System.out.println("Do concrete1");
	}

	public void doConcrete2(){
		System.out.println("Do concrete2");
	}

	abstract public void doSomething();
}

public class AbstractTestMain {
	public static void main(String[] args) {
		AbstractTest test = new AbstractTest();
		test.doSomething();
	}
}

The code above does not compile.
Fix the above problem by introducing a concrete class called AbstractTest01.
It must extend AbstractTest
It must implement the doSomething method and print "Doing something" there in.
The do somthing method must call doConcrete1 the print "Doing Something" then call doConcrete2

