/*
You are given a list of N integers and you need to reverse it and print the reversed list in a new line.


Constraints
1≤N,Ai≤10^5
Sample Input 1:
4
1 3 2 4
Sample Output 1:
4 2 3 1


*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseMe {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
