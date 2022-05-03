public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odds = new ArrayList<Integer>();
        List<Integer> evens = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                evens.add(nums[i]);
            }else{
                odds.add(nums[i]);
            }
        }
        
        evens.addAll(odds);
        
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            result[i] = evens.get(i);
        }
        
        return result;
    }
}
