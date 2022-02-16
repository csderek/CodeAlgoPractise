class Solution {
    public static void main(String[] args) {
        int res = threeSumClosest(new int[]{-3,-2,-5,3,-4}, -1);
        System.out.println("Result: " + res);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int maxDiff = 0;
        for(int i = 0; i < nums.length ; i++){
           for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    System.out.println("nums i j k: " + nums[i] + " " + nums[j] + " " + nums[k]);
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(target - sum);
                    System.out.println("Sum: " + sum + " diff: " + diff + " maxDiff: " + maxDiff);
                    if(diff == 0) return target;
                    if(maxDiff == 0){
                        maxDiff = diff;
                        result = sum;
                    }else if(diff < maxDiff){
                        maxDiff = diff;
                        result = sum;
                    }
                }
           }
        }
        return result;
    }
}