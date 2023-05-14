import java.util.Scanner;

public class GenderGetter
{
    public static String getGender()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender:");
        return scanner.nextLine();
    }
}
