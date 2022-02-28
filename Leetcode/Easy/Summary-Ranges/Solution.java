import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return new ArrayList<String>();
        if(nums.length == 1) return new ArrayList<String>(Arrays.asList(Integer.toString(nums[0])));
        List<String> resultList = new ArrayList<String>();
        
        int start = nums[0];
        int end = nums[0];
        for(int i = 1; i < nums.length ; i++){
            
            if(nums[i] - nums[i-1] == 1){
                end = nums[i];
            }else{
                if(end > start){
                    resultList.add(Integer.toString(start) + "->" + Integer.toString(end));
                }else{
                    resultList.add(Integer.toString(start));
                }
                start = nums[i];
            }
            
            
            if(i == nums.length - 1){
                if(end > start){
                    resultList.add(Integer.toString(start) + "->" + Integer.toString(end));
                }else{
                    resultList.add(Integer.toString(start));
                }
            }
            
        }
        return resultList;
    }
}