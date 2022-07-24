/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int n = 0; n < T; n++){
    		int X = in.nextInt();
    		int Y = in.nextInt();
    		System.out.println(X * 10 + Y * 90);
		}
	}
}
