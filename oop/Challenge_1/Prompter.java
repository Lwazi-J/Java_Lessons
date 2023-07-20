import java.util.Scanner;

public class Prompter
{
    public static String prompt(String message)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
}



