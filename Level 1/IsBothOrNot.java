/*
You're given a number N. If N is divisible by 5 or 11 but not both then print "ONE"(without quotes). 
If N is divisible by both 5 and 11 then print "BOTH"(without quotes).
 If N is not divisible by 5 or 11 then print "NONE"(without quotes).

Constraints
1≤N≤10^3
Sample Input 1:
50
Sample Output 1:
ONE
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class IsBothOrNot {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 5 == 0 || n % 11 == 0) {
            if (n % 5 == 0 && n % 11 == 0) {
                System.out.println("BOTH");
            } else {
                System.out.println("ONE");
            }
        } else {
            System.out.println("NONE");
        }
    }
}
