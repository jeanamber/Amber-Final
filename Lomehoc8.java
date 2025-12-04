
/**
 * Write a description of class Lomehoc8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lomehoc8
{
    public static void main(String [] args){
        int[] A = {5, 10, 20, 25};
        int[] B = new int[A.length];
         
        for (int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
        
        for (int num : B){
            System.out.print(num + " ");
        }
    }
}