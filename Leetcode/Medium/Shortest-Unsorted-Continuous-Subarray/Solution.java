import java.util.Stack;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1) return 0;
        
        Stack<Integer> indexStack = new Stack<Integer>();
        
        int l = nums.length, r = 0; 
        
        for(int i = 0; i < nums.length ; i++){
            while(!indexStack.isEmpty() && nums[i] < nums[indexStack.peek()]){
                l = Math.min(l, indexStack.pop());
            }
            indexStack.push(i);
        }
        indexStack.clear();
        for(int i = nums.length - 1; i >= 0 ; i--){
            while(!indexStack.isEmpty() && nums[i] > nums[indexStack.peek()]){
                r = Math.max(r, indexStack.pop());
            }
            indexStack.push(i);
        }
        
        return r - l + 1 < 0 ? 0 : r - l + 1;
        
    }
}