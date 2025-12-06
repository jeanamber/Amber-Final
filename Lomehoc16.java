
/**
 * Write a description of class Lomehoc12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Number16 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numStr = sc.nextLine();

        int length = numStr.length();

        if (numStr.charAt(0) == '-') {
            length--;
        }

        System.out.println("Total digits (excluding sign): " + length);

        sc.close();
    }
}
