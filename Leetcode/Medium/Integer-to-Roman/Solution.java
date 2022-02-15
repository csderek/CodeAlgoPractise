import java.util.*;

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        
        int index = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(num != 0){
            int cur = num % 10;
            if(cur < 4 && cur > 0){
                while(cur > 0){
                    int value = (int)(1 * Math.pow(10, index));
                    sb.insert(0, map.get(value));
                    cur--;
                }
            }else if(cur > 5 && cur < 9){
                
                while(cur - 5 > 0){
                    int value = (int)(1 * Math.pow(10, index));
                    sb.insert(0, map.get(value));
                    cur--;
                }
                int valueFive = (int)(5 * Math.pow(10, index));
                sb.insert(0, map.get(valueFive));
            }else if(cur > 0){
                int value = (int)(cur * Math.pow(10, index));
                sb.insert(0, map.get(value));
            }
            
            num = num / 10;
            index++;
        }
        return sb.toString();
    }
}