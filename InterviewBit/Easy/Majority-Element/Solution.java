import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        double minAppearTimes = Math.floor(A.size()/2);
        
        for (int i : A){
            Integer count = countMap.containsKey(i) ? countMap.get(i) + 1 : 1;
            if (count > minAppearTimes){
                return i;
            } 
            countMap.put(i, count);
        }
        return -1;
    }
}
