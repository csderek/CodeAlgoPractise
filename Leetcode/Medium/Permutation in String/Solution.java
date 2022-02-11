class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1Arr = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Arr[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            int[] s2Arr = new int[26];
            for(int j = 0; j < s1.length(); j++){
                s2Arr[s2.charAt(i + j) - 'a']++;
            }
            
            if(checkMatch(s1Arr, s2Arr)) return true;
        }
        
        return false;
    }
    
    public boolean checkMatch(int[] s1Arr, int[] s2Arr){
        for(int i = 0; i < 26; i++){
            if(s1Arr[i] != s2Arr[i]) return false;
        }
        return true;
    }
}