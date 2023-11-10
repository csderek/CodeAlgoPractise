import java.util.*;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adjacentMap = new HashMap();
        List<Integer> resultList = new ArrayList<Integer>();
        HashSet<Integer> loopedInt = new HashSet();
        for(int[] ap : adjacentPairs){
            int a = ap[0];
            int b = ap[1];

            
            List<Integer> adjacentAList = adjacentMap.get(a);
            List<Integer> adjacentBList = adjacentMap.get(b);
            if (adjacentAList == null) adjacentAList = new ArrayList<Integer>();
            adjacentAList.add(b);
            if (adjacentBList == null) adjacentBList = new ArrayList<Integer>();
            adjacentBList.add(a);

            adjacentMap.put(a, adjacentAList);
            adjacentMap.put(b, adjacentBList);
            
        }

        int start = 0;
        for(Integer key : adjacentMap.keySet()){
            if(adjacentMap.get(key).size() == 1) {
                start = key;
                break;
            }
        }

        //System.out.println("Start: " + start);

        resultList.add(start);
        loopedInt.add(start);
        while(resultList.size() < adjacentMap.size()){
            //System.out.println("Result List Size: " + resultList.size());
            //System.out.println("Adjacent Map Size: " + adjacentMap.size());
            // System.out.println("Start: " + start);
           List<Integer> ls = adjacentMap.get(start);
           for(Integer i : ls){
               System.out.println("i: " + i);
               if (loopedInt.contains(i)) continue;
               resultList.add(i);
               loopedInt.add(i);
               start = i;
           }
        }

        return resultList.stream().mapToInt(i->i).toArray();
    }
}