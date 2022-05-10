import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int min = (1+k) * (k) / 2;
        if(n < min) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        combine(k, n, 1, new ArrayList<Integer>(), result);
        return result;
    }
    
    public void combine(int k, int n, int start, List<Integer> tmp, List result){
        System.out.println("k: " + k);
        System.out.println("n: " + n);
        System.out.println("tmp size: " + tmp.size());
        System.out.println("start: " + start);
        if(n == 0 && tmp.size() == k){
            result.add(new ArrayList<>(tmp));
            return;
        }
        
        if(n - start < 0){
            return;
        }
        
        
        for(int i = start; i <= 9; i++){
            tmp.add(i);
            combine(k, n - i, i+1, tmp, result);
            tmp.remove(tmp.size()-1);
        }
        
        
    }
    
}