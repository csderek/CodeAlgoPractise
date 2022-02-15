import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        HashSet<String> set = new HashSet<String>();
        set.add("IV");
        set.add("IX");
        set.add("XL");
        set.add("XC");
        set.add("CD");
        set.add("CM");
        
        int result = 0;
        
        String prev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            String cur = Character.toString(s.charAt(i));
            if(set.contains(cur + prev)){
                result = result - map.get(cur);
            }else{
                result = result + map.get(cur);
            }
            prev = cur;
        }
        
        return result;
    }
}