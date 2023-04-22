import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;

        Stack<Character> CStack = new Stack<Character>();

        for(Character c : s.toCharArray()){
            if('(' == c || '{' == c || '[' == c){
                    CStack.push(c);
            }else{
                if(CStack.empty()) return false;

                Character lc = CStack.pop();

                if(')' == c && '(' != lc){
                    return false;
                }else if('}' == c && '{' != lc){
                    return false;
                }else if(']' == c && '[' != lc){
                    return false;
                }
            }
        }
        

        return CStack.empty();
    }
}