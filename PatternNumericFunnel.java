/*
PROBLEM:
Decode the logic and print the pattern that corresponds to the given input.

INPUT FORMAT:
The input will contain a single integer n denoting the number of rows.

OUTPUT FORMAT:
Print the pattern mentioned in the problem statement.

SAMPLE INPUT 1:
		3

SAMPLE OUTPUT 1:
		10203010011012
		**4050809
		****607

SAMPLE INPUT 2:
		4

SAMPLE OUTPUT 2:
		1020304017018019020
		**50607014015016
		****809012013
		******10011
*/

// CODE:

class PatternNumericFunnel
{
    public static void main(String []s)
    {
        int i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char stemp[] = new char[str.length()];
        
        for(i = 0, j = str.length() / 2; j < str.length(); i++, j++)
            stemp[i] = (char)str.charAt(j);
            
        for(j = 0; i < str.length(); i++, j++)
            stemp[i] = (char)str.charAt(j);
            
        for(i = 0; i < str.length(); i++)
        {
            for(j = 0; j < str.length() - i - 1; j++)
                System.out.print(" ");
            for(j = 0; j <= i; j++)
                System.out.print(stemp[j]);
            System.out.println();
        }
    }
}