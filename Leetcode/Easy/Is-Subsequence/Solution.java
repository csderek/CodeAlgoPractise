class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int lastIndex = -1;
        for(char c : s.toCharArray()){
            if(lastIndex == t.length() - 1) return false;
            int index = t.indexOf(c, lastIndex+1);
            if(index < 0){
                return false;
            }
            lastIndex = index;
        }
        return true;
    }
}