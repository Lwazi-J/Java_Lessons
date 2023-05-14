import java.util.Scanner;

public class SportGetter
{
    public String getSport()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sport:");
        return scanner.nextLine();
    }
}

