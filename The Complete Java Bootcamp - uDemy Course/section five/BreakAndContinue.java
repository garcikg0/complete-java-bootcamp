/**
 * The continue keyword SKIPS a run, and continues to the next one.
 * 
 * The break keyword BREAKS the loop.
 */

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/**
 * 
 * You know how to use:
 *      for loops to run code a specific number of times
 *      while loops to run code an unknown number of times
 *      break and continue inside your loops.
 */