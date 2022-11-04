/**
 * IntroToArrays
 * use Arrays to store many values at once. 
 * The variable does not store the array. It stores a REFERENCE that points to it. 
 * 
 * Access values from an array:
 *  - you can access an element from its index. 
 * 
 * Index out of range:
 *  - you can't access an index that doesn't exist. you can't access an index beyond the bounds of the array. 
 */
public class IntroToArrays {
    public static void main(String[] args) {
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "E A"};
        System.out.println(kingdoms[0]);
        System.out.println(kingdoms[1]);
        System.out.println(kingdoms[2]);
        System.out.println(kingdoms[3]);
    }
    
}