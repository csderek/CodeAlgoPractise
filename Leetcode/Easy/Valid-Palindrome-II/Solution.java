class Solution {
    public boolean validPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 -i)){
                return isPalindrome(s.substring(i+1, s.length() - 1 -i + 1)) || 
                    isPalindrome(s.substring(i, s.length() - 1 -i));
            }
        }
        
        return true;
    }
    
    public boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 -i)){
                return false;
            }
        }
        return true;
    }
}