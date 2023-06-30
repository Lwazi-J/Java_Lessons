public class DeleteUserTest
{
    public static void main(String[] args)
    {
        UserDAO.CreateUser("Thebe","Ramathebane","theberamathebane3@gmail.com","01/01/2000","2");
        UserDAO.findAll();
        UserDAO.deleteUser("theberamathebane3@gmail.com");
        UserDAO.findAll();
    }
}
