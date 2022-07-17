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
		in.nextLine();
		for(int n = 0; n < T; n++){
		    String line = in.nextLine();
		    //System.out.println(line);
		    String[] arr = line.split(" ");
		    int X = Integer.parseInt(arr[0]);
		    int Y = Integer.parseInt(arr[1]);
		    
		    if(X >= Y){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
