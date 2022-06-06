// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int count = sc.nextInt();
	  
	  while(count-->0){
	      int num = sc.nextInt();
	      int lastLetter = num % 10;
	      int firstLetter = num % 10;
	      while(num / 10 > 0){
	          
	          num = num / 10;
	      }
	      firstLetter = num % 10;
	      System.out.println(firstLetter + lastLetter);
	  }
	}
}


