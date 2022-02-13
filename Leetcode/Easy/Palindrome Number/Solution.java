class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int cur = x;
        long result = 0;
        while(cur > 0){
            result = result * 10 + cur % 10;
            cur = cur / 10;
        }
        
        if(result == x) return true;
        return false;
    }
}