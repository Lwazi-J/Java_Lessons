public class UpdateUserTest
{
    public static void main(String [] args)
    {
        UserDAO.CreateUser("Bokamoso", "Semoko", "theberamathebane3@gmail.com", "01/01/2000", "10");
        UserDAO.updateUser("Thebe", "Ramathebane", "theberamathebane3@gmail.com", "01/01/2020","54164654141544");

        UserDAO.findAll();
    }
}
