import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length ; i++){
            if(set.contains(nums[i])) continue;
            HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
            HashSet<Integer> set2 = new HashSet<Integer>();
            
            for(int j = i+1; j < nums.length; j++){
                if(set2.contains(nums[j])) continue;
                //if(j - 1 != i && nums[j] == nums[j-1]) continue;
                int remain = 0 - nums[i] - nums[j];
                if(map.containsKey(remain)){
                    List<Integer> result = new ArrayList<Integer>();
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(remain);
                    resultList.add(result);
                    set2.add(nums[j]);
                }
                //set2.add(nums[j]);
                map.put(nums[j], j);
            }
            
            set.add(nums[i]);
        }
        return resultList;
    }
}