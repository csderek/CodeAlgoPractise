import java.util.*;

public class Solution {

    
    public static void main(String[] args){
        Solution s = new Solution();
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        List<Integer> B = new ArrayList<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(1);
        B.add(2);

        int result = s.canCompleteCircuit(A, B);
        System.out.println("result: " + result);
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        if (A.size() == 1){
            if(A.get(0) >= B.get(0)){
                return 0;
            }
        }
        
        for(int i = 0; i < A.size(); i++){
            int oil = 0;
            boolean  cont = true;
            for(int j = i; j < A.size(); j++){
                oil = oil + A.get(j);
                int used = B.get(j);
                
                System.out.println("i: " + i + "; j: " + j);
                System.out.println("oil: " + oil + ";used: " + used);

                if(oil >= used){
                    oil = oil - used;
                }else{
                    cont = false;
                    break;
                }
            }
            if (!cont){
                continue;
            }
            for(int k = 0; k < i; k++){
                oil = oil + A.get(k);
                int used = B.get(k);

                System.out.println("i: " + i + "; k: " + k);
                System.out.println("oil: " + oil + ";used: " + used);
                
                if(oil >= used){
                    oil = oil - used;
                }else{
                    cont = false;
                    break;
                }
            }
            if (!cont){
                continue;
            }
            return i;
            
            
        }
        return -1;
    }
}
