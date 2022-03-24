/*
You're given the length of three sides a, b, and c respectively. 
Now check if these three sides can form a triangle or not. 
Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0, 
otherwise print "NO" (without quotes).


Constraints
1≤a,b,c≤10^6
Sample Input 1:
2 4 3
Sample Output 1:
YES


*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class ValidTriangle {
    public static void main(String[] args) throws java.lang.Exception {
        String str = "YES";
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b < c || b + c < a || c + a < b) {
            str = "NO";
        }
        System.out.println(str);
    }
}
