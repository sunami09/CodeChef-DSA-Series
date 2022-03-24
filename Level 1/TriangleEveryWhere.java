
/*
You're given the length of three sides a, b, and c respectively. 
Now If these three sides can form an Equilateral Triangle then print 1, 
if these three sides can form an Isosceles Triangle then print 2, 
if these three sides can form a Scalene Triangle then print 3, otherwise print −1.

Constraints
1≤a,b,c≤10^3
Sample Input 1:
2 4 3
Sample Output 1:
3
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class TriangleEveryWhere {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            if (a == b || b == c || c == a) {
                if (a == b && b == c) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(3);
            }
        } else {
            System.out.println(-1);
        }

    }
}
