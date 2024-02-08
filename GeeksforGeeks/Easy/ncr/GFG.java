//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int nCr(int n, int r)
    {
        Double mod = 1e9+7;
        if(r > n) return 0;
        
        if(n == r) return 1;
        
        Double nProduct = 1.0;
        
        for(int i = n; i > 0; i--){
            nProduct = (nProduct * i);
        }
        
        
        Double rLeftProduct = 1.0;
        Double rRightProduct = 1.0;
        
        
      
        for(int i = r; i > 0; i--){
            rLeftProduct = (rLeftProduct * i);
        }

        for(int i = n - r; i > 0; i--){
            rRightProduct = (rRightProduct * i);
        }
        
        //System.out.println("nProduct: " + nProduct);
        //System.out.println("rLeftProduct: " + rLeftProduct);
        //System.out.println("rRightProduct: " + rRightProduct);
        
        
        Double rProduct = (rLeftProduct) * (rRightProduct);

        //System.out.println("rProduct: " + rProduct);
        Double result = nProduct / rProduct;

        //Double nModProduct = nProduct % mod;
        //Double rModProduct = rProduct % mod;

        //Double modResult = nModProduct / rModProduct;

        //System.out.println("nModProduct: " + nProduct);
        //System.out.println("rModProduct: " + rProduct);
        //System.out.println("modResult: " + modResult);

        //System.out.println("result before Mod: " + result);
        result = result % mod;
        //System.out.println("result after Mod: " + result);
        //int result = nProduct / (rProduct);
        //result = result % (int)(mod);
        return result.intValue();
    }
}