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
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    
		    if(K == 0){
		        System.out.println(N);
		    }else{
		        System.out.println(N % K);
		    }
		    
		}
	}
}
