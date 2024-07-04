//{ Driver Code Starts
    import java.io.*;
    import java.lang.*;
    import java.util.*;
    
    class Main {
        static BufferedReader br;
        static PrintWriter ot;
    
        public static void main(String[] args) throws IOException {
    
            br = new BufferedReader(new InputStreamReader(System.in));
            ot = new PrintWriter(System.out);
    
            int t = Integer.parseInt(br.readLine());
    
            while (t-- > 0) {
    
                String s[] = br.readLine().trim().split(" ");
    
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                int a[] = new int[n];
                s = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
                Solution obj = new Solution();
                ArrayList<Integer> res = obj.subarraySum(a, n, k);
                for (int ii = 0; ii < res.size(); ii++) ot.print(res.get(ii) + " ");
                ot.println();
            }
            ot.close();
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        // Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
            // Your code here
            
            
            ArrayList<Integer> resultList = new ArrayList<Integer>();
            
            if(n == 1){
                if(arr[0] == s){
                    resultList.add(1);
                    resultList.add(1);
                    return resultList;
                }else{
                    resultList.add(-1);
                    return resultList;
                }
            }
            
            int right = 0;
            int left = 0;
            int total = 0;
            while(right < n){
                //System.out.println("right: " + right);
                total += arr[right];
                
                while(total > s && left < right){
                    total-=arr[left];
                    left++;
                }
                
                if(total==s){
                    resultList.add(left+1);
                    resultList.add(right+1);
                    return resultList;
                }
                
                right++;
            }
            
            resultList.add(-1);
            return resultList;
        }
    }