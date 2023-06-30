public class GetUserByEmailTest
{
    public static void main(String[] args)
    {
        UserDAO.CreateUser("Thebe","Ramathebane","theberamathebane3@gmail.com","01/01/2000","2");
        UserDAO.getUserByEmail("theberamathebane3@gmail.com");
    }
}
