import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        HashMap<String, List<String>> asciiMap = new HashMap<String, List<String>>();
        if(strs.length == 1){
            List<String> r = new ArrayList<String>();
            r.add(strs[0]);
            result.add(r);
            return result;
        }
        for(String s : strs){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            String sortedStr = new String(tempArray);
            List<String> strList = asciiMap.get(sortedStr);
            if (strList == null) strList = new ArrayList<String>();
            strList.add(s);
            asciiMap.put(sortedStr, strList);
        }
        for(List<String> recs: asciiMap.values()){
            result.add(recs);
        }
        
        return result;
    }
}