
/**
 * Write a description of class Lomehoc12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Number19 
{
    public static void main(String[] args) {

        String[] students = { "Amber", "Sherlyn", "Eliaza", "Bentozal" };
        int[] grades = { 85, 72, 90, 78 };

        System.out.println("List of Students and Their Grades:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + grades[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a student's name to check their grade: ");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println("Grade of " + students[i] + ": " + grades[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found in the list.");
        }

        sc.close();
    }
}
