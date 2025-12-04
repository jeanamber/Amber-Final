
/**
 * Write a description of class Lomehoc2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lomehoc2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int count = 0;
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++){
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++){
            if (numbers[i] == 7){
                count++;
            }
            
            System.out.println("The number 7 appears" + count + " time(s).");
        }
}
}