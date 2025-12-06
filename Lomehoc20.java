
/**
 * Write a description of class Lomehoc12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Number20 
{
    public static void main(String[] args) {

        int[] numbers = { 10, 25, 30, 15, 40, 18, 50 };


        System.out.print("Even numbers greater than 20: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20 && numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
