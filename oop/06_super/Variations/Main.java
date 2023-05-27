public class Main 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("Any Animal");
        Dog dog = new Dog("Spoty");
        Cat cat = new Cat("Zuzu");

        animal.eat();
        dog.eat();
        cat.eat();

        dog.bark();
        cat.meow();
    }
}
