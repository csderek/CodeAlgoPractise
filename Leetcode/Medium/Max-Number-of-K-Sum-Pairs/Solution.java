class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> intMap = new HashMap<Integer,Integer>();
        
        int count = 0;
        for(int i : nums){
            int remain = k - i;
            if(intMap.containsKey(remain) && intMap.get(remain) > 0){
                intMap.put(remain, intMap.get(remain) - 1);
                count++;
            }else{
                if(intMap.containsKey(i)){
                    intMap.put(i, intMap.get(i)+1);
                }else{
                    intMap.put(i, 1);
                }
            } 
        }
        
        return count;
    }
}