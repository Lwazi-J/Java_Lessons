public class MilesCalculator
{
    public static double ToMiles(String kiloM)
    {
        //working out kilometers to miles
        double newKilo = Double.parseDouble(kiloM);
        return newKilo * 0.621371;
    }

    public static double ToMeters(String kiloM)
    {
        //working out the distance in meters
        double newKilo = Double.parseDouble(kiloM);
        return newKilo/100;
    }

}



