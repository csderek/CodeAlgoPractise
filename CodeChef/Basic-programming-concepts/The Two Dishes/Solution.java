/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-->0){
		    int max = sc.nextInt();
		    int sum = sc.nextInt();
		    int maxDiff = 0;
		    for(int i = 0; i <= max; i++){
		        if(i > sum) break;
		        if(sum - i > max) continue;
		        
		        int diff = Math.abs(i - (sum - i));
		        maxDiff = Math.max(maxDiff, diff);
		    }
		    System.out.println(maxDiff);
		}
	}
}
