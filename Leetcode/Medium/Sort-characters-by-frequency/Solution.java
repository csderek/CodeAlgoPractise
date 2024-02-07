import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        TreeSet<Integer> countSet = new TreeSet<Integer>();
        for(Character c : s.toCharArray()){
            Integer count = countMap.get(c);
            if(count == null){
                count = 1;
            }else{
                count++;
            }
            countMap.put(c, count);
            //countSet.add(count);
        }

        System.out.println("Map: "+ countMap);
        for(Integer count : countMap.values()){
            countSet.add(count);
        }
        //System.out.println("Set: "+ countSet);

        TreeSet<Integer> resCountSet = (TreeSet<Integer>)countSet.descendingSet();

        //System.out.println("Set: "+ resCountSet);
        StringBuilder result = new StringBuilder();
        for(Integer i : resCountSet){
            
            for (Map.Entry<Character, Integer> set : countMap.entrySet()) {
                //System.out.println("i: "+ i);
                //System.out.println("Key: "+ set.getKey()+ ";Value: " + set.getValue());
                 //System.out.println("Match Count: " + (set.getValue() - i));
                if(set.getValue() - i == 0){
                    
                    String insertedString = String.valueOf(set.getKey()).repeat(i);
                    //System.out.println("insertedString: "+ insertedString);
                    result.append(insertedString);
                }
            }
        }

        return result.toString();
    }
}