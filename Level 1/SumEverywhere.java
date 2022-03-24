/*
You are given a number N and find the sum of the first N odd 
and even numbers in a line separated by space. All even and odd numbers should be greater than 0.

Constraints
1≤N≤10^6
Sample Input 1:
4
Sample Output 1:
16 20

*/

import java.util.*;
import java.lang.*;
import java.io.*;


public class SumEverywhere {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        // Sum of n odd numbers = n^2;
        System.out.print(n * n + " ");
        // Sum of n even numbers = n(n+1);
        System.out.print(n * (n + 1));
    }
}
