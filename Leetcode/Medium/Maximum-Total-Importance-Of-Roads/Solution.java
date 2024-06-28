import java.util.Arrays;

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] countArr = new long[n];
        long result = 0;
        for(int i = 0; i < roads.length; i++){
            countArr[roads[i][0]] += 1;
            countArr[roads[i][1]] += 1;
        }
        Arrays.sort(countArr);
        System.out.println(Arrays.toString(countArr));


        for(int i = 0; i < n; i++){
            result = result + countArr[i] * (i + 1);
        }

        return result;

    }
}