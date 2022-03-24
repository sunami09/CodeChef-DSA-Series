
/*
You are given a number N. Find the sum of all numbers from 1 to N.

Constraints
1≤N≤10^9
Sample Input 1:
4
Sample Output 1:
10
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class AddNaturalNumbers {
    
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(n * (n + 1) / 2);
    }
}
