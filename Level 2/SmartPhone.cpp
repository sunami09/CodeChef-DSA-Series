/*


Link: https://www.codechef.com/LRNDSA01/problems/ZCO14003

Smart Phone            ||||                  Problem Code: ZCO14003

You are developing a smartphone app. You have a list of potential customers for your app. Each customer has a budget and will buy the app at your declared price if and only if the price is less than or equal to the customer's budget.


You want to fix a price so that the revenue you earn from the app is maximized. Find this maximum possible revenue.


For instance, suppose you have 4 potential customers and their budgets are 30, 20, 53 and 14. In this case, the maximum revenue you can get is 60 .


Input format
Line 1 : N, the total number of potential customers.

Lines 2 to N+1: Each line has the budget of a potential customer.


Output format
The output consists of a single integer, the maximum possible revenue you can earn from selling your app.


Sample Input 1
4
30
20
53
14

Sample Output 1
60

Sample Input 2
5
40
3
65
33
21

Sample Output 2
99



*/

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;

    cin >> n;

    vector<long long int> arr;

    for (int i = 0; i < n; i++)
    {
        long long int k;
        cin >> k;
        arr.push_back(k);
    }

    sort(arr.begin(), arr.end());

    long long int revenue = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] * (n - i) > revenue)
        {
            revenue = arr[i] * (n - i);
        }
    }

    cout << revenue << endl;

    return 0;
}
