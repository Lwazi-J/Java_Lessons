import java.util.Scanner;

public class Prompter
{
    public static void Ask()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Enter your surname:");
        String surname = in.nextLine();
        System.out.println("Enter your email:");
        String email = in.nextLine();
        System.out.println("Enter your date of birth in the form (dd/mm/yyyy):");
        String dob = in.nextLine();
        DateValidator.isValid(dob);
        System.out.println("Enter your ID number:");
        String id_no = in.nextLine();

        UserDAO.CreateUser(name,surname,email,dob,id_no);
    }

    public static void updateInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = in.nextLine();
        UserDAO.getUserByEmail(email);

        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Enter your surname:");
        String surname = in.nextLine();
        System.out.println("Enter your date of birth in the form (dd/mm/yyyy):");
        String dob = in.nextLine();
        DateValidator.isValid(dob);
        System.out.println("Enter your ID number:");
        String id_no = in.nextLine();

        UserDAO.updateUser(name,surname,email,dob,id_no);
    }
}
