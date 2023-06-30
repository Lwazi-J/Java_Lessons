public class UserDAOTest
{
    public static void main(String []args)
    {
        String[][] database = new String[10][5];

        UserDAO.CreateUser("John","Smith","john@test.com","11/11/1999","1");
        UserDAO.CreateUser("Thebe","Ramathebane","theberamathebane3@gmail.com","01/01/2000","2");

        UserDAO.findAll();
    }

}