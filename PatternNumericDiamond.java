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
        1
        2*3
        4*5*6
        7*8*9*10
        7*8*9*10
        4*5*6
        2*3
        1

SAMPLE INPUT 2:
		5

SAMPLE OUTPUT 2:
        1
        2*3
        4*5*6
        7*8*9*10
        11*12*13*14*15
        11*12*13*14*15
        7*8*9*10
        4*5*6
        2*3
        1
*/

// CODE:

import java.util.*;

class PatternNumericDiamond
{
    public static void main(String s[])
    {
        int i = 0, j = 0, count = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(i = 0; i < n; i++)
        {
            for(j = 0; j <= i; j++)
            {
                System.out.print(count++);
                if(i != j)
                    System.out.print("*");
            }
            System.out.println();
        }
        
        for(i = n; i > 0; i--)
        {
            count -= i;
            for(j = 0; j < i; j++)
            {
                System.out.print(count + j);
                if(i != j + 1)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}