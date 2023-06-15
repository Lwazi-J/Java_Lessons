/*Accessing each day*/


public class EnumTest {
	public static void main(String[] args) {
		Day day1 = Day.MONDAY;
		Day day2 = Day.TUESDAY;
                Day day3 = Day.WEDNESDAY;
                Day day4 = Day.THURSDAY;
                Day day5 = Day.FRIDAY;
               	Day day6 = Day.SATURDAY;
                Day day7 = Day.SUNDAY;
		 
		boolean res1 = day1.equals(day1);
		 
		System.out.println(day1+" equals "+day1+" is "+res1);
 
	}
 
}

