public class NamesMain4
{
    public static void main(String[] args)
    {
        GenderGetter genderG = new GenderGetter();
        SportGetter sportG = new SportGetter();
        SchoolGetter schoolG = new SchoolGetter();

        String myGender = genderG.getGender();
        String mySport = sportG.getSport();
        String mySchool = schoolG.getSchool();

        System.out.println("Hello, I am a " + myGender + " participant in " + mySport + "\n" + "at " + mySchool + " High School");

    }
}
