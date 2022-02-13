class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            int lenWithOdd = checkPalindrome(s, i , i);
            int lenWithDouble = checkPalindrome(s, i, i+1);
            
            int len = Math.max(lenWithOdd, lenWithDouble);
            
            if(len > end - start){
                start = i - (len - 1) /2;
                end = i + len/2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    public int checkPalindrome(String s, int l, int r){
        int left = l;
        int right = r;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}