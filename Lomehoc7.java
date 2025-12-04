
/**
 * Write a description of class Lomehoc7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc7
{
    public static void main(String [] args){
        
        int[] numbers = {3, -5, 12, -8, 7, -1};
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                numbers[i] = Math.abs(numbers[i]);
            }
        }
        
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}