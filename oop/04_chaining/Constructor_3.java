public class Constructor3 {
    public Constructor3(){
   	 System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name,String sname){
   	 this();
   	 System.out.println("Running name arg constructor: Name ="+name+" "+sname);
    }
    
    public Constructor3(String name,String sname, String occu){
   	 this("Lwazi","Jiyane");
   	 System.out.println("Running name arg constructor: Name ="+name+" "+sname + " is a "+occu);
    }
   
}

public class ConstructorTest_3 {
    public static void main(String[] args) {
   	 new Constructor3("Lwazi","Jiyane");
	new Constructor3("Lwazi","Jiyane","Programmer");
    }
}

