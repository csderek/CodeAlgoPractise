import java.util.*;

class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> intlist = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            intlist.add(i);
        }

        int index = 0;
        while(intlist.size() > 1){
            int removeindex = (index + (k-1)) % intlist.size();
            intlist.remove(removeindex);
            index = removeindex;
        }

        return intlist.get(0);
    }
}