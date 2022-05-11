class Solution {
    char[] arr = {'a','e','i','o','u'};
    
    public int countVowelStrings(int n) {
        if(n == 1) return 5;

        int ans = 0;
        
        for(char c : arr){
            ans = ans + count(n-1, c);
        }
        
        return ans;
    }
    
    public int count(int n, char c2){
        
        if(n == 0) return 1;
        
        int res = 0;
        
        for(char c : arr){
            if(c >= c2){
                res = res + count(n-1, c);
            }
        }
        return res;
    }
}