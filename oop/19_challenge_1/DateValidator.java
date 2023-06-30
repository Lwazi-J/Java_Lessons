public class DateValidator
{
    public static boolean isValid(String value)
    {
        if(value.length() != 10)
        {
            System.out.println("Your date of birth in incomplete");
            return false;
        }

        if(!value.contains("/"))
        {
            System.out.println("Your date of birth should contain / ");
            return false;
        }

        String [] pieces = value.split("/");

        if(pieces.length != 3)
        {
            System.out.println("Your date of birth should contain 3 / ");
            return false;
        }

        return true;
    }
}

