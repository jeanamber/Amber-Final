
/**
 * Write a description of class Lomehoc12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc12
{
    public static void main(String[] args){
        int[] numbers = {5, 2, 5, 7, 5, 9};
        int target = 5;
        int count = 0;
        
        for (int num : numbers) {
            if (num == target){
                count++;
            }
        }
        
        if (count >= 3){
            if (count >= 3){
                System.out.println(target + " appears at least 3 times.");
            } else {
                System.out.println(target + "does NOT appear 3 times.");
            }
            }
        }
    }
