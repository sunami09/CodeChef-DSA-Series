/*
You are given a number N and find all the distinct factors of N.

Constraints
1≤N≤10^6
Sample Input 1:
4
Sample Output 1:
3
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class FactorsFinding {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(1);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    } 
}
