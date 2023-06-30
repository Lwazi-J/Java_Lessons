import java.util.Scanner;

public class UserDAO
{
    static Scanner in = new Scanner(System.in);
    public static String[][] database = new String[10][5];
    public static int position = 0;

    public static void CreateUser(String name,String surname, String email,String dob,String id)
    {
        String [] db = new String[6];
        db[0] = name;
        db[1] = surname;
        db[2] = email;
        db[3] = dob;
        db[4] = id;
        int age = AgeCalculator.calculate(dob);
        String ageCon = Integer.toString(age);
        db[5] = ageCon;
        database[position++] = db;
        String username = db[0]+" "+db[1];
        System.out.println("The details of " + username +" have captured" );
    }
    public static void updateUser(String name, String surname, String email, String dob, String id)
    {
        for (String [] db : database)
        {
            if((db != null) && email.equals(db[2]))
            {
                db[0] = name;
                db[1] = surname;
                db[3] = dob;
                db[4] = id;
                String username = db[0]+" "+db[1];
                System.out.println("The details of " + username +" have updated" );
            }
        }
    }
    public static void deleteUser(String email)
    {
        System.out.println("Enter your email:");
        email = in.nextLine();
        getUserByEmail(email);
        for (String [] db : database)
        {
            if((db != null) && email.equals(db[2]))
            {
                db[0] = null;
                db[1] = null;
                db[2] = null;
                db[3] = null;
                db[4] = null;
                System.out.println("User details deleted");
            }
        }
    }
    public static String[] getUserByEmail(String email)
    {
        for(String [] db : database)
        {
            if ((db != null) && email.equals(db[2]))
            {
                System.out.println("User Exists");
                return db;
            }
            else {
                System.out.println("User does not Exists");
            }
        }
        return null;
    }
    public static void findAll()
    {
        System.out.println("=============ALL USERS=================\n");
        for(String [] db : database)
        {
            if(db[0] != null)
            {
                System.out.println("Name: " + db[0]);
                System.out.println("Surname: " + db[1]);
                System.out.println("Email: " + db[2]);
                System.out.println("Date of birth: " + db[3]);
                System.out.println("ID number: " + db[4]);
                System.out.println("Age: " + db[5]);
                System.out.println();
            }
        }
    }
}
