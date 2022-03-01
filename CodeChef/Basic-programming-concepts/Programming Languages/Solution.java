/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-->0){
		    Set<Integer> resultSet = new HashSet<Integer>();
		    resultSet.add(sc.nextInt());
		    resultSet.add(sc.nextInt());
		    
		    Set<Integer> setA = new HashSet<Integer>();
		    setA.add(sc.nextInt());
		    setA.add(sc.nextInt());
		    
		    Set<Integer> setB = new HashSet<Integer>();
		    setB.add(sc.nextInt());
		    setB.add(sc.nextInt());
		    
		    if(setA.containsAll(resultSet)){
		        System.out.println("1");
		    }else if(setB.containsAll(resultSet)){
		        System.out.println("2");
		    }else{
		        System.out.println("0");
		    }
		}
	}
}
