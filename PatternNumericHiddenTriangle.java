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
        4444
        3444
        2344
        1234

SAMPLE INPUT 2:
		5

SAMPLE OUTPUT 2:
        55555
        45555
        34555
        23455
        12345
*/

// CODE:

import java.util.*;

class PatternNumericHiddenTriangle
{
    public static void main(String s[])
    {
        int i = 0, j = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(i = 0; i < n; i++)
        {
            for(j = 0, k = n - i; j < n; j++)
            {
                System.out.print(k);
                if(k != n)
                    k++;
            }
            
            System.out.println();
        }
    }
}