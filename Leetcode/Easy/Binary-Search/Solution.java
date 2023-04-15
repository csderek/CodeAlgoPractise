class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){

           // System.out.println(left); 0
           // System.out.println(right); 5
            int diff = right - left;
           // System.out.println(diff); 5
            int div = diff / 2;
           // System.out.println(div); 2
            int mid = left + div;
            
           // System.out.println(mid); 2
           // System.out.println(nums[mid]); 3

            if(nums[mid] == target){
                return mid;
            }else if (target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }
}