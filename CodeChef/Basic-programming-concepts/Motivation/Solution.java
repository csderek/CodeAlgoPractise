import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-->0){
		    int numOfMovies = sc.nextInt();
		    int size = sc.nextInt();
		    int maxRate = 0;
		    while(numOfMovies-->0){
		        int curSize = sc.nextInt();
		        int rate = sc.nextInt();
		        if(curSize <= size) maxRate = Math.max(maxRate, rate);
		    }
		    
		    System.out.println(maxRate);
		}
	}
}
