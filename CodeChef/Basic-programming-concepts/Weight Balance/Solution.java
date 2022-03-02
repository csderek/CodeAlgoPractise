/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while(count-->0){
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M = sc.nextInt();
		    
		    int diff = w2 - w1;
		    if(diff >= x1 * M && diff <= x2 * M){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		}
	}
}
