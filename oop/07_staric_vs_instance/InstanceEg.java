/* The image above illustrates the concept of an static variable getting allocated once in the class 
The following  is an example of a class that defines a static variable called myVar.*/


public class InstanceEg{
    int myVar;
} 


/*An instance has been defined as a particular appearance or or occurrence of something.
 * This happens when you create a java class and you define a method inside it
 * and you do not put the static keyword in the beginning.
 * By omitting the static keyword you make the method instance not static.*/

public class InstanceEg{
    int myVar;

    int getMyVar(){
        return myVar;
    }
} 


/*You can mix instance and static variables and methods. The following program shows this:*/

public class MixInstEg1{
    int myVar = 4;
    static int myVar2 = 2;


    int getDifference(){
        return myVar2 - myVar;
    }
}




