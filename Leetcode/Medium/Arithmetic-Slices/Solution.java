class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        if(nums.length < 3) return 0;
        
        int count = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                result = result + ++count;
            }else{
                count = 0;
            }
        }
        return result;
    }
}