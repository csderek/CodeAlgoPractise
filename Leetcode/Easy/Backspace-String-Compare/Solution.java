import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sq = new Stack<Character>();
        Stack<Character> tq = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                if(sq.size() > 0){
                    sq.pop();
                }
            }else{
                sq.push(s.charAt(i));
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#'){
                if(tq.size() > 0){
                    tq.pop();
                }
            }else{
                tq.push(t.charAt(i));
            }
        }
        
        System.out.println("sq: " +  sq);
        System.out.println("tq: " +  tq);
        
        return sq.equals(tq);
    }
}