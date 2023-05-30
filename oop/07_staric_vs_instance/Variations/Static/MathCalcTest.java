public class MathCalcTest {
	public static void main(String[] args) {
        // Accessing the static variable
        System.out.println("Value of PI: " + MathUtils.PI);

        // Invoking the static method
        int sum = MathUtils.add(5, 3);
        System.out.println("Sum: " + sum);
    }
}
