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
		    int x = sc.nextInt();
		    if(x < 100){
		        System.out.println("Easy");
		    }else if(x >= 200){
		        System.out.println("Hard");
		    }else{
		        System.out.println("Medium");
		    }
		}
	}
}
