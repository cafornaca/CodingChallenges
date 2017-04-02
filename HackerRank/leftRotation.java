import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class leftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // How many numbers in array
        int k = in.nextInt(); // How many rotations for the array
        int a[] = new int[n]; // Filling the array
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        in.close();
        }
        
        int b[] = new int [n]; // An array to hold moved items
        for (int b_i = 0; b_i < n; b_i++){
            for (int m = n; n >= 0; n--){
                b[b_i] = a[m];
            }
        }
        
        for (int print = 0; print < n; print++){
            System.out.print(b[print] + " ");
        }
            
        
     /* Notes:
      * - We are doing LEFT rotations
      * - We will probably have to designate more arrays to hold
      * - Could we turn it into a linked list and play with the locations instead?
      * - Rotations mean we will probably use modulo to wrap-around
      */ 
    }
}
