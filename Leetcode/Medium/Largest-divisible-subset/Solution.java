class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        HashMap<Integer, List<Integer>> divisibleMap = new HashMap<>();

        Arrays.sort(nums);
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(nums[0]);
        divisibleMap.put(nums[0], firstList);
        for(int i = 1; i < nums.length; i++){
            List<Integer> currList = new ArrayList<Integer>();
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0){
                    List<Integer> tmpList = divisibleMap.get(nums[j]);
                    if(tmpList.size() > currList.size()){
                        currList.clear();
                        currList.addAll(tmpList);
                    }
                }
            }
            currList.add(nums[i]);
            divisibleMap.put(nums[i], currList);
        }
        List<List<Integer>> valueList = new ArrayList<>();
        for(List<Integer> iList : divisibleMap.values()){
            valueList.add(iList);
        }
        Collections.sort(valueList, new Comparator<List>(){
            public int compare(List a1, List a2) {
                return a2.size() - a1.size(); // assumes you want biggest to smallest
            }
        });

        return valueList.get(0);
    }
}