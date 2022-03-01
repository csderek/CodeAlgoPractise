// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int count = sc.nextInt();
	    while(count-->0){
	        String str = sc.next();
	        int numOfFour = 0;
	        for(int i = 0; i < str.length(); i++){
	            if(str.charAt(i) == '4') numOfFour++;
	        }
	        System.out.println(numOfFour);
	    }
	}
}


