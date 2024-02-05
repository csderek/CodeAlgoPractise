import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> cSet = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (cSet.contains(c)) continue;

            if(s.indexOf(c, i+1) == -1) return i;

            cSet.add(c);
        }
        return -1;
    }
}