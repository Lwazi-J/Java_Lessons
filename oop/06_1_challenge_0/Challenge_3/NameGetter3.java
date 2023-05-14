import java.util.Scanner;

public class NameGetter3
{
    public static String getName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        return scanner.nextLine();
    }
}
