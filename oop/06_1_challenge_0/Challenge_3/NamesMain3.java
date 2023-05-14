import java.util.Scanner;

public class NamesMain3
{
    public static void main(String[] args)
    {
        NameGetter3 nameGetter = new NameGetter3();
        SurnameGetter3 surnameGetter = new SurnameGetter3();
        AgeGetter3 ageGetter = new AgeGetter3();

        String name = nameGetter.getName();
        String surname = surnameGetter.getSurname();
        int age = ageGetter.getAge();

        System.out.println("Hello " + name + " " + surname + "\n" + "You are " + age);

    }
}
