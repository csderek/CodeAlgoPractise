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
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-->0){
		    int days = sc.nextInt();
		    int lower = sc.nextInt();
		    int upper = sc.nextInt();
		    
		    if(days < lower){
		        System.out.println("Too Early");
		    }else if(days > upper){
		        System.out.println("Too Late");
		    }else{
		        System.out.println("Take second dose now");
		    }
		}
	}
}
