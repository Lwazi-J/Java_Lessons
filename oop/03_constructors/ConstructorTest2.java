/*Perform the following steps:
Change the program to print "Doing construction" every time the constructor runs.
Create 2 instances of Constructor1 in the main method of ConstructorTest2.*/

public class ConstructorTest2 {
    public static void main(String[] args) {
 	Constructor1 con1 = new Constructor1();
	Constructor1 con2 = new Constructor1();
    }
}

public class Constructor1 {

    public Constructor1() 
	{
		System.out.println("Doing construction");
	}
 
}
