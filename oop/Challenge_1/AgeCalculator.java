public class AgeCalculator
{
    public static double calculate(String db)
    {
        //working out age
        String[] parts = db.split("/");
        String date = parts[0];
        String month = parts[1];
        String year = parts[2];
        return 2023 - Integer.parseInt(year);
    }
    public static double ToSeconds(double ageY)
    {
        //working out age in seconds
        return ageY * 31536000;
    }
    public static double ToMilliSecs(double ageY)
    {
        //working out age in milliseconds
        return ageY * 315576000;
    }

}


