/*Perform the following steps:
Change the program to print your name and surname.
Save the files.*/

public class NamesMain1 {
    public static void main(String[] args) {
 	   NamePrinter namePrinter = new NamePrinter();
 	   SurnamePrinter surnamePrinter = new SurnamePrinter();

 	   namePrinter.print();
 	   surnamePrinter.print();
    }
}

public class NamePrinter {
    public void print(){
 	   System.out.println("My name is Lwazi");
    }
}

public class SurnamePrinter {
    public void print(){
 	   System.out.println("My surname is Jiyane.");
    }
}

