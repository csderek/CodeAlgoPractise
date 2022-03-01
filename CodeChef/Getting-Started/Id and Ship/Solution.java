/* package codechef; // don't place package name! */

import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Map<String, String> map = new HashMap<String, String>();
		map.put("b", "BattleShip");
		map.put("c", "Cruiser");
		map.put("d", "Destroyer");
		map.put("f", "Frigate");
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-->0){
		    String s = sc.next();
		    System.out.println(map.get(s.toLowerCase()));
		}
		
	}
}
