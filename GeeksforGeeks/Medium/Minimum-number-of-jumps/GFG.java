//{ Driver Code Starts
    import java.lang.*;
    import java.io.*;
    import java.util.*;
    class GFG
     {
        public static void main (String[] args) throws IOException
         {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine()); 
    
            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                System.out.println(new Solution().minJumps(arr));
            }
         }
         
    }
    
    // } Driver Code Ends
    
    
    class Solution{
        static int minJumps(int[] arr){
            // your code here
            if(arr.length == 0) return -1;
            if(arr[0] == 0) return -1;
            
            int count = 0;
            int index = 0;
            
            while(index < arr.length-1){
                
                System.out.println("Index: " + index);
                int step = arr[index];
                
                System.out.println("Index: " + index + ";Step: " + step);

                //if(step >= arr.length - index + 1) return count+1; 

                if(step == 1 && arr[index+1] == 0) return -1;
                

                //System.out.println("2 Index: " + index + ";Step: " + step);
                int maxStep = -1;
                int nextIndex = -1;
                
                
                if(step < arr.length - index + 1) {
                    for(int i = index+1; i <= index+step && i < arr.length; i++){
                        
                        int NextStep = i + arr[i];

                        System.out.println("index: " + i + ";NextStep: " + NextStep + ";maxStep: " + maxStep);

                        if( NextStep > maxStep){
                            maxStep = NextStep;
                            nextIndex = i;
                        }

                        if(NextStep >= arr.length){
                            nextIndex = i;
                        }
                    }
                    index = nextIndex;
                }else{
                    index = arr.length;
                }
                
                
                count++;
                System.out.println("index: " + index + ";count: " + count);
                //index = nextIndex;
                
            }
            return count;
        }
    }