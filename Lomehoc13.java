
/**
 * Write a description of class Lomehoc12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc13
{
    public static void main(String[] args) {

        int[] grades = {80, 70, 90, 65, 75, 88, 60, 77};
        int passed = 0;
        int failed = 0;

        System.out.print("Student Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        for (int grade : grades) {
            if (grade >= 75) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Total students who passed: " + passed);
        System.out.println("Total students who did not pass: " + failed);
    }
}
