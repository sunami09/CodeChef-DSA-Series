/*

Chef went to a shop and buys a pens and b pencils. 
Each pen costs x units and each pencil costs y units. Now find what is the total amount 
Chef will spend to buy a pens and b pencils.

Constraints
1≤a,b,x,y≤10X10X10

Sample Input 1:
2 4 4 5
Sample Output 1:
28


*/


import java.util.*;
import java.lang.*;
import java.io.*;


class BuyPlease {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println((a * x) + (b * y));
    }
}
