/*

You're given the three angles a, b, and c respectively. Now check if these three 
angles can form a valid triangle with an area greater than 0 or not. Print "YES"(without quotes) 
if it can form a valid triangle with an area greater than 0, otherwise print "NO" (without quotes).


Constraints
0≤a,b,c≤180

Sample Input 1:
20 40 120
Sample Output 1:
YES
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class TriangleAngle {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String answer = "NO";
        if (a > 0 && b > 0 && c > 0) {
            if (a + b + c == 180) {
                answer = "YES";
            }

        }
        System.out.println(answer);

    }
}
