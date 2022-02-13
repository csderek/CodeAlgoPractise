package Leetcode.Medium.Subsets;
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  resultList = new ArrayList<>();
        resultList.add(new ArrayList<Integer>());
        
        for(int n : nums){
            
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(n);
            resultList.add(cur);
            int listsize = resultList.size();
            for(int i = 1; i < listsize - 1; i++){
                List<Integer> combined = new ArrayList<Integer>();
                combined.addAll(resultList.get(i));
                combined.add(n);
                resultList.add(combined);
            }
                
        }
        
        return resultList;
    }
}