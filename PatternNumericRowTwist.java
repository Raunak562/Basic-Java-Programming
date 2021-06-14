/*
PROBLEM:
Decode the logic and print the pattern that corresponds to the given input.

INPUT FORMAT:
The input will contain a single integer n denoting the number of rows.

OUTPUT FORMAT:
Print the pattern mentioned in the problem statement.

SAMPLE INPUT 1:
		4

SAMPLE OUTPUT 1:
        1 * 2 * 3 * 4
        9 * 10 * 11 * 12
        13 * 14 * 15 * 16
        5 * 6 * 7 * 8

SAMPLE INPUT 2:
		5

SAMPLE OUTPUT 2:
        1 * 2 * 3 * 4 * 5 
        11 * 12 * 13 * 14 * 15 
        21 * 22 * 23 * 24 * 25 
        16 * 17 * 18 * 19 * 20 
        6 * 7 * 8 * 9 * 10 
*/

// CODE:

import java.util.*;

class PatternNumericRowTwist
{
    public static void main(String []s)
    {
        int i = 0, j = 0, k = 0, l = 0, flag = 0, count = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int ans[][] = new int[n][n];
        int total = n * n;
        
        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                arr[i][j] = count++;
        
        i = 0;
        j = n - 1;
        while(l != n)
        {
            if(flag == 0)
            {
                for(k = 0; k < n; k++)
                    ans[i][k] = arr[l][k];
                i++;
                l++;
                flag = 1;
            }
            else
            {
                for(k = 0; k < n; k++)
                    ans[j][k] = arr[l][k];
                j--;
                l++;
                flag = 0;
            }
        }
            
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(j != n - 1)
                    System.out.print(ans[i][j] + " * ");
                else
                    System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}