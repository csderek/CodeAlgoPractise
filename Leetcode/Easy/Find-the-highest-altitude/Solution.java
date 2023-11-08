class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int count = 0;
        for(int i : gain){
            count = count + i;
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}