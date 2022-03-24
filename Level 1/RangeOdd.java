/*
You're given two numbers L and R. Print all odd numbers 
between L and R (both inclusive) in a single line separated by space, in ascending (increasing) order.

Constraints
1≤L<R≤10^6
Sample Input 1:
2 9
Sample Output 1:
3 5 7 9
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class RangeOdd {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int start = a;
        if (a % 2 == 0) {
            start = a + 1;
        }
        for (int i = start; i <= b; i += 2) {
            System.out.print(i + " ");
        }
    }
}
