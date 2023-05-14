public class NamesMain2
{
    public static void main(String[] args)
    {
        NameGetter2 nameGetter = new NameGetter2();
        SurnameGetter2 surnameGetter = new SurnameGetter2();
        AgeGetter2 ageGetter = new AgeGetter2();

        String name = nameGetter.getName();
        String surname = surnameGetter.getSurname();
        int age = ageGetter.getAge();

        System.out.println("Hello " + name + " " + surname + "\n" + "You are " + age);

    }
}
