/* package codechef; // don't place package name! */

import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		while(c-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    System.out.println(Math.max(Math.max(A+B, B+C), A+C));
		}
	}
}
