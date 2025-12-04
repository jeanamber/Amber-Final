
/**
 * Write a description of class Lomehoc9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lomehoc9
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        
        System.out.println("Enter numbers (0 to stop):");
        
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break; // stop loop
            }
            sum += num;
        }
        
        System.out.println("Sum = " + sum);
    }
}