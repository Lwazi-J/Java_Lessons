public class NumberValidator
{
    public static boolean IsValid(String input)
    {
        if (input == null || input.matches("^[a-zA-Z]*$"))
        {
            return false;
        }

        else
        {
            return true;
        }

    }
}



