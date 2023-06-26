/* Below is an example of how to use negate which is a default method on Predicate.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {
   public static void main(String[] args) {
       List<Integer> numbers =
               new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       numbers.removeIf(((Predicate<Integer>) (e -> e > 5)).negate());
       System.out.println(numbers);
   }
}

