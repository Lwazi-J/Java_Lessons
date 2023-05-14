import java.util.Scanner;

public class SchoolGetter
{
    public String getSchool()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your school name: ");
        return scanner.nextLine();
    }
}

