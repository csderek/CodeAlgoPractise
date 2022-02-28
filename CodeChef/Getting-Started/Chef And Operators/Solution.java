/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
        int count = sc.nextInt();
        
        while(count-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            if(l-r > 0){
                System.out.println(">");
            }else if(l-r < 0){
                System.out.println("<");
            }else{
                System.out.println("=");
            }
        }
	}
}
