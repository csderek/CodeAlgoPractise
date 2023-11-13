import java.util.*;

class Solution {
    public String sortVowels(String s) {
        List<Character> vowelList = new ArrayList<Character>();
        //List<Integer> indexList = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1){
                vowelList.add(c);
            }
        }

        vowelList = vowelList.stream().sorted().collect(Collectors.toList());
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                sb.append(vowelList.get(i));
                i++;
            }else{
                sb.append(c);
            }
        }


        return sb.toString();
    }
}