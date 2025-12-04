
/**
 * Write a description of class Lomehoc6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc6
{
    public static void main(String [] args){
        int[] numbers = {3, 8, 11, 14, 5, 7};
        int sum = 0;
        int count = 0;
        
        for (int num : numbers){
            if (num % 2 !=0) {
                sum += num;
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("Average of odd numbers found.");
        }
    }
}