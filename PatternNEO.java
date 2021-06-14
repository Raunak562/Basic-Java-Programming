/*
PROBLEM:
Phoebe has a child studying in kindergarten, who has a unique habit of writing a word.
He writes a word in such a way that the first letter of the word is in the first row, the first 2 letters of the word are in the second row, and so on.
At the end of finishing a word, he ensures that the number of letters in the word and the number of rows he used are the same.
This unique way of writing letters will give him a reverse right-angled triangle at the end.

INPUT FORMAT:
The input will contain a single integer n denoting the number of rows.

OUTPUT FORMAT:
Print the pattern mentioned in the problem statement.

SAMPLE INPUT 1:
		NEOWISE

SAMPLE OUTPUT 1:
		      W
		     WI
		    WIS
		   WISE
		  WISEN
		 WISENE
		WISENEO

SAMPLE INPUT 2:
		IAMNEO

SAMPLE OUTPUT 2:
		     N
		    NE
		   NEO
		  NEOI
		 NEOIA
		NEOIAM
*/

// CODE:

class PatternNEO
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