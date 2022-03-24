/*
You are given a list of N integers and a value K. 
Print 1 if K exists in the given list of N integers, otherwise print −1.

Constraints
1≤N,K,Ai≤10^5
Sample Input 1:
4 2
1 2 3 4
Sample Output 1:
1

*/

import java.util.*;
import java.lang.*;
import java.io.*;




public class FindMe {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        int answer = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == k) {
                answer = 1;
            }
        }
        System.out.println(answer);

    }
}
