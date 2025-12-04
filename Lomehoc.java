
/**
 * Write a description of class Lomehoc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lomehoc
{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        while(true){
            System.out.print("Please input a number between ( 1 to100):");
            int userInput=input.nextInt();
            if(userInput>=1 && userInput<=100){
                break;
            }
        }
    }
}