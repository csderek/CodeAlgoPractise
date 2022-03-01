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
		    int angleA = sc.nextInt();
		    int angleB = sc.nextInt();
		    int angleC = sc.nextInt();
		    
		    if(angleA + angleB + angleC == 180){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
