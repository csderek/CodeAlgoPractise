import java.util.*;

class Solution {

    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println("Result: " + result);
    }

    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        
        List<String> ansList = new ArrayList<String>();
        
        HashMap<Character, String[]> map = new HashMap<Character, String[]>();
        
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
        
        boolean isFirst = true;
        
        for(Character c : digits.toCharArray()){
            String[] arr = map.get(c);
            System.out.println("Arr: " + Arrays.toString(arr));
            isFirst = ansList.size() == 0;
            System.out.println("isFirst: " + isFirst);
            List<String> tmp = new ArrayList<String>();
            System.out.println("ansList: " + ansList);
            for(String s : arr){
                if(isFirst){
                    ansList.add(s);
                }else{
                    for(String s2 : ansList){
                        String newS = s2 + s;
                        System.out.println("newS: " + newS);
                        tmp.add(newS);
                    }
                }
            }
            if(!isFirst){
                System.out.println("tmp: " + tmp);
                ansList = tmp;
            }
            
        }
        
        return ansList;
    }
}