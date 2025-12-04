
/**
 * Write a description of class Lomehoc10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc10
{
    public static void main(String [] args){
        int[] numbers = {5, 7, 9, 12, 15, 20};
        int index = -1;
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                index = i;
                break;
            }
        }
        
        if (index != -1){
            System.out.println("First even number found at index: " + index);
        } else {
            System.out.println("No even number found.");
        }
        }
}