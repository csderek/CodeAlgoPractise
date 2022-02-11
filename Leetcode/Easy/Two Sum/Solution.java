class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) numMap.put(nums[i], i);
        for(int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            if(numMap.containsKey(remain) && numMap.get(remain) != i) return new int[]{i, numMap.get(remain)};
        }
        return null;
    }
}