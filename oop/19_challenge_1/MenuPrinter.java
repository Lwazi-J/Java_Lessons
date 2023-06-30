import java.util.Scanner;
public class MenuPrinter
{
    static Scanner sc = new Scanner(System.in);
    private static String email;
    public static void print()
    {
        System.out.println("""
                          ==============MENU===============\n
                          Pick an Option:
                          ○ 1. Add a user
                          ○ 2. Delete a user
                          ○ 3. Update a user - Should prompt for email
                          ○ 4. List users - Displays all the users in the list array
                          ○ 5. To exit or terminate the program""");

        String inp = sc.next();
        switch (inp)
        {
            case "1":
                Prompter.Ask();
                break;
            case "2":
                UserDAO.deleteUser(email);
                break;
            case "3":
                Prompter.updateInfo();
                break;
            case "4":
                UserDAO.findAll();
                break;
            case "5":
                System.exit(0);
            default:
                print();
        }
        print();
    }
}
