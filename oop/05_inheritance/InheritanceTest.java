/*The following code shows how inheritance can be implemented in java using the extends keyword.
 * If a class extends another class then it is a child to that class.*/

public class InheritanceTest {
	public static void main(String[] args) {
		Child myVar = new Child();

		System.out.println("================The child has:");
		System.out.println("Grand Parents Money :"+myVar.getGrandParentsMoney());
		System.out.println("Parents Money :"+myVar.getParentsMoney());
		System.out.println("Child's Money :"+myVar.getChildsMoney());
	}
}

