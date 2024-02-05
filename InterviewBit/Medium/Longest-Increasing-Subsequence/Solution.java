import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
    public static Logger logger = Logger.getLogger(Solution.class.getName());

    public static void main(String[] args) {
        Solution s = new Solution();
        Integer[] arr = new Integer[]{69, 54, 19, 51, 16, 54, 64, 89, 72, 40, 31, 43, 1, 11, 82, 65, 75, 67, 25, 98, 31, 77, 55, 88, 85, 76, 35, 101, 44, 74, 29, 94, 72, 39, 20, 24, 23, 66, 16, 95, 5, 17, 54, 89, 93, 10, 7, 88, 68, 10, 11, 22, 25, 50, 18, 59, 79, 87, 7, 49, 26, 96, 27, 19, 67, 35, 50, 10, 6, 48, 38, 28, 66, 94, 60, 27, 76, 4, 43, 66, 14, 8, 78, 72, 21, 56, 34, 90, 89};
        //Integer[] arr = new Integer[]{1,2,1,5};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        int result = s.lis(list);
        logger.log(Level.INFO, "Result: " + result);
        
    }

    public int lis(final List<Integer> A) {
        int result = 0;

        for(int i = 0; i < A.size(); i++){
            List<Integer> subList = A.subList(i+1, A.size());
            List<Integer> seqList = new ArrayList<Integer>();
            seqList.add(A.get(i));
            //logger.log(Level.INFO, "Start From Zero: " + A.get(i));
            int count = 1 + seqCount(A.get(i), subList, seqList);
            //logger.log(Level.INFO, "Start From Zero: " + A.get(i) + ";Count: " + count);
            //logger.log(Level.INFO, "List: " + seqList.toString());
            result = Math.max(result, count);
        }

        return result;
    }

    public int seqCount(int prev,List<Integer> A, List<Integer> seqList){
        if(A.size() == 0) return 0;

        int maxResult = 0;
        int result = 0;
        for(int i = 0; i < A.size(); i++){
            //logger.log(Level.INFO, "Continue: " + A.get(i) + ";Prev: " + prev);
            List<Integer> subList = A.subList(i+1, A.size());
            if(A.get(i) > prev){
                int nextPrev = A.get(i);
                //seqList.add(A.get(i));
                result = 1 + seqCount(nextPrev, subList, seqList);
                
            }else{
                result = seqCount(prev, subList, seqList);
            }
            //logger.log(Level.INFO, "Continue: " + A.get(i) + ";Prev: " + prev + ";Result: " + result);
            //logger.log(Level.INFO, "List: " + subList.toString());
            maxResult = Math.max(maxResult, result);
        }

        return maxResult;
    }
}
