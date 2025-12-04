
/**
 * Write a description of class Lomehoc4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc4
{
    public static void main(String[] args){
        
        int[] numbers = {5, 12, 3, 9, 20, 1, 7, 1242};
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
            
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}