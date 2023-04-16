class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] sArr = s.split(" ");
        if(pattern.length() != sArr.length) return false;
        HashMap<Character, String> hm = new HashMap<Character, String>();
        HashSet<String> hs = new HashSet<String>();
        for(int i = 0; i < pattern.length(); i++){
            Character ch = pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(! sArr[i].equals(hm.get(ch))) return false;
            }else{
                if (hs.contains(sArr[i])) return false;
                hm.put(ch, sArr[i]);
                hs.add(sArr[i]);
            }
        }
        return true;
    }
}