/* This code is an excercise based on inheritance and constructors*/


public class Animal 
{
    protected String name;

    public Animal(String name) 
    {
        this.name = name;
    }
      
    public void eat() 
    {
        System.out.println("The animal is eating.");
    }

    public void sleep() 
    {
        System.out.println("The animal is sleeping.");
    }
}
