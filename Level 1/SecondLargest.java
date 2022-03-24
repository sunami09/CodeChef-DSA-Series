
/**
Given three distinct integers A, B and C, print the second largest number among them.

Constraints
1≤A,B,C≤10^9


Sample Input 1:
2
7
21
Sample Output 1:
7

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class SecondLargest {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.println(a);
        } else if (b >= c && b <= a || b <= c && b >= a) {
            System.out.println(b);
        } else if (c >= b && c <= a || c <= b && c >= a) {
            System.out.println(c);
        }

    }
}
