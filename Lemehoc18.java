
/**
 * Write a description of class Lomehoc12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Number18 {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 7, 5, 3, 8 };
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) {
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("Duplicate values found in the array.");
        } else {
            System.out.println("No duplicate values found in the array.");
        }
    }
}
