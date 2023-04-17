class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<Boolean>();
        for(int c : candies){
            if(c > max) max = c;
        }

        for(int c : candies){
            result.add(c + extraCandies >= max);
        }

        return result;
    }
}