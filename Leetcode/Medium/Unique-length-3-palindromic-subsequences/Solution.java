import java.util.*;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0;
        HashSet<Character> cSet = new HashSet<Character>();
        for(int i = 0; i < s.length() - 2; i++){
            char c = s.charAt(i);
            //System.out.println("i: " + i);
            //System.out.println("c: " + c);
            if(cSet.contains(c)) continue;
            //System.out.println("cSet: " + cSet);
            int lastIndex = s.lastIndexOf(c);
            //System.out.println("lastIndex: " + lastIndex);
            if(lastIndex == i || lastIndex - i < 2) continue;
            HashSet<Character> matchedSet = new HashSet<Character>();

            for(int j = i+1; j < lastIndex; j++){
                char c2 = s.charAt(j);
                if(matchedSet.contains(c2)) continue;

                count++;
                matchedSet.add(c2);
            }
            cSet.add(c);
        }

        return count;
    }
}