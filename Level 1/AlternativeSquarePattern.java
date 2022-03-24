
/*
You're given a number N. Print the first N lines of the below-given pattern.

1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
30 29 28 27 26

Constraints
1≤N≤200

Sample Input 1:
4

Sample Output 1:
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16

*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class AlternativeSquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
            for(int j=0;j<5;j++){
                System.out.print(count+" ");
                count += 1;
            }}
            else{
                int k = 4;
                for(int j=0;j<5;j++){
                    int answer = count +k;
                    System.out.print(answer + " ");
                    count += 1;
                    k=k-2;
                }
            }
            System.out.println();
        }
    }
}
