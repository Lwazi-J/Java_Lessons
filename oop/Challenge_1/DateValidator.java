public class DateValidator
{
    public static boolean IsValid(String dateStr)
    {
        if (dateStr == null || dateStr.length() != 10)
        {
            return false;
        }
        String[] parts = dateStr.split("/");
        if (parts.length != 3)
        {
            return false;
        }
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year < 1000 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31)
        {
            return false;
        }
        else
        {
            System.out.println("Date is VALID!!");
        }

        return true;
    }
}



