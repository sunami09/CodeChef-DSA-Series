
/*
You are given an array A of n unique integers.
You have to find 2nd maximum and 2nd minimum numbers in this array.

If A = [3, 7, -1, 2, 4, 9]

2nd max is 7
2nd min is 2

Constraints
1. 2 <= n <= 100

Example

Sample Input
6
3 7 2 -1 4 9

Sample Output
7 2


*/
import java.io.*;
import java.util.*;

public class MaxMin2 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort(arr);
        System.out.println(arr[n - 2] + " " + arr[1]);

    }

    static void sort(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}