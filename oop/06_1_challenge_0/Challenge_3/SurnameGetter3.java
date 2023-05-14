import java.util.Scanner;

public class SurnameGetter3
{
    public String getSurname()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your surname:");
        return scanner.nextLine();
    }
}

