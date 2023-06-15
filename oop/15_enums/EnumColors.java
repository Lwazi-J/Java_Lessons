/*Iterating through all the colors*/

public class EnumTest1 {
	public static void main(String[] args) {
		Colors[] values = Colors.values();
		 
		for(Colors clr :values){
			System.out.println(clr);
		}
	}
}

