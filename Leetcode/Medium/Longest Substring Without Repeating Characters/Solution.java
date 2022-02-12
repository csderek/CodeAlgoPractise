import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<String, Integer> existString = new HashMap<String, Integer>();
        int max = 1;
        int l = 0;
        for(int i = 0; i < s.length(); i++){
            String c = Character.toString(s.charAt(i));
            if(existString.containsKey(c)){
                l = existString.get(c) + 1 > l ? existString.get(c) + 1 : l;
            }
            
            max = i - l + 1 > max ? i - l + 1 : max;
            
            existString.put(c, i);
        }
        
        
        return max;
    }
}