public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("run: " + i);

            for (int j = 0; j < 3; j++) {
                System.err.println(j);
            }
        }
    }
}

/**
 * Applications of nested loops
 *  - useful when working with 2D arrays
 */