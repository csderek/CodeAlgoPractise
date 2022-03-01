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
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    int a = sc.nextInt();
		    int s = sc.nextInt();
		    
		    
		    
		    double cal = u * u - 2 * a * s;
		    
		    if(cal <= v*v){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
