import java.util.*;

class Solution {
    public boolean hasAllCodes(String s, int k) {
        int numberOfRecords = 1 << k;
        
        Set<String> bitSet = new HashSet<String>();
        
        for(int i = k; i <= s.length(); i++){
            String bit = s.substring(i - k, i);
            if(!bitSet.contains(bit)){
                bitSet.add(bit);
            }
        }
        
        return bitSet.size() == numberOfRecords;
    }
}