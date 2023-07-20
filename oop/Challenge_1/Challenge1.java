public class Challenge1
{
    public static void main(String[] args)
    {
        String name = Prompter.prompt("Enter your name :");
        String surname = Prompter.prompt("Enter your surname :");
        String birthDate = Prompter.prompt("Enter your date of birth dd/MM/yyyy :");

        //validating date of birth
        while(!DateValidator.IsValid(birthDate))
        {
            System.out.println("Date is INVALID. PLEASE enter a VALID date");
            birthDate = Prompter.prompt("Enter your date of birth dd/MM/yyyy :");
        }
        String distance = Prompter.prompt("How far is your favourite store from your home? :");

        //validating distance
        while(!NumberValidator.IsValid(distance))
        {
            System.out.println(distance + " is INVALID. PLEASE enter a VALID distance");
            distance = Prompter.prompt("How far is your favourite store from your home? :");
        }

        double age = AgeCalculator.calculate(birthDate);
        double miles = MilesCalculator.ToMiles(distance);
        double meters = MilesCalculator.ToMeters(distance);
        double seconds = AgeCalculator.ToSeconds(AgeCalculator.calculate(birthDate));
        double milli = AgeCalculator.ToMilliSecs(AgeCalculator.calculate(birthDate));

        Printer.Print(name,surname,birthDate);

        System.out.println("You are " + age + " years old");
        System.out.println("Distance in miles is : " + miles + " miles");
        System.out.println("Distance in meters is: " + meters + " meters");
        System.out.println("Age in seconds is: " + seconds + " seconds");
        System.out.println("Age in milliseconds is: " + milli + " milliseconds");
    }
}


