
/*
You're given a number N. Print the first N lines of the below-given pattern.

    *
   **
  ***
 ****
*****


Constraints
1≤N≤200
Sample Input 1:
4
Sample Output 1:
   *
  **
 ***
****

*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseStar {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
