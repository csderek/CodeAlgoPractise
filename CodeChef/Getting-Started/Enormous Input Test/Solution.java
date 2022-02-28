// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;  


// Remember that the class name should be "Main" and should be "public".
class Solution {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}
        sc.close();
		System.out.println(ans);

	}

	
}