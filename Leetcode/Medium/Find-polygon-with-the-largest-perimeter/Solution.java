import java.util.*;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long max = -1;
        long total = nums[0] + nums[1] ;
        for(int i = 2; i < nums.length; i++){ 
            if(total > nums[i]){
                max = nums[i] + total;
            }
            total = nums[i] + total;
        }
        return max;
    }
}