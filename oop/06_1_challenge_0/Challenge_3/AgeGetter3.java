import java.util.Scanner;

public class AgeGetter3
{
    public int getAge()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        return scanner.nextInt();
    }
}

