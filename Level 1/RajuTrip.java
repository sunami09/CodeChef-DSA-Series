/*
Raju is planning to visit his favourite restaurant. He shall travel to it by bus. 
Only the buses whose numbers are divisible by 5 or by 6 shall take him to his destination. 
You are given a bus number N. 
Find if Raju can take the bus or not. Print YES if he can take the bus, otherwise print NO.

Constraints
1≤N≤10^6
Sample Input 1:
60
Sample Output 1:
YES
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class RajuTrip {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 5 == 0 || n % 6 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
