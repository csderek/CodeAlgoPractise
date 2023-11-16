import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        List<Integer> intList = new ArrayList<Integer>();

        for(String s : nums){
            intList.add(Integer.parseInt(s, 2));
        }

        double max = Math.pow((double) 2, (double) n);

        for(int i = (int) max - 1; i >= 0; i--){
            if(intList.contains(i)) continue;

            String result = Integer.toBinaryString(i);

            if(result.length() != n){
                int len = n - result.length();
                String s = String.format("%0" + len + 'd', 0);
                result = s + result;
            }

            return result;
        }

        return "";
        
    }
}