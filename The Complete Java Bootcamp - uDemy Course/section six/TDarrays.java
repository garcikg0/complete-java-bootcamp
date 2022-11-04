import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        // int[][] grades = new int[3][4];
        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;

        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;

        // grades[2][0] = 95;
        // grades[2][1] = 98;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        //faster way below

        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        // System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        // System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        // System.out.println("\tHermoine: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);

        // NESTED LOOPS

        // for (int j = 0; j < grades[0].length; j++) {
        //     System.out.print(grades[0][j] + " ");
        // }

        // System.out.print("\n");
        // for (int j = 0; j < grades[1].length; j++) {
        //     System.out.print(grades[1][j] + " ");
        // }

        // System.out.print("\n");
        // for (int j = 0; j < grades[2].length; j++) {
        //     System.out.print(grades[2][j] + " ");
        // }
        // System.out.print("\n");
        // Nested loop of above:
        for (int i = 0; i < grades.length; i++){

            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2:System.out.print("\tHermoine: "); break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

/**
 * a 2-D array is a great way to store data in a table. 
 * Access values from an array - you can access an element from its index. 
 * 
 * The length of a 2D array is determined by the number of rows.
 * Each row is a normal array. So, the length of a row is determind by its number of elements.
 * 
 * Nested Array:
 * for (int i = 0; i < grades.length; i++) {                1. Outer loop runs through every row (i).
 *      for (int j = 0; j < grades[i].length; j++) {        2.Inner loop runs through every item in that row.
 *      
 *      } 
 * }
 * 
 */
