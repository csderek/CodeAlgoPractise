import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int n : nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        
        Iterator<Integer> itr = set.iterator();
        return itr.next();
    }
}