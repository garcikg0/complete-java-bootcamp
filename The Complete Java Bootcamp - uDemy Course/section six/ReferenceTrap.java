import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}

/*
 * The state of a variable should not change because you updated another.
 * 
 * Trap: Setting array variables equal to each other.
 * Pitfall: Both variables point to the same array. 
 * Solution: Create a new array. Then, copy every value using a loop.
 * 
 * Better Solution - Arrays.copyOf(array, array.length);
 * Trap: Setting array variables equal to another.
 * Pitfall: Both variables point to the same array. 
 * Solution: Set it equal to a copy of the array(Arrays.copyOf).
 * 
 */