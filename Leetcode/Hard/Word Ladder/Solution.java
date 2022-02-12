import java.util.*;

class Solution {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<String>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        int num = ladderLength("hit", "cog", wordList);

        System.out.println("Result: " + num);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        
        HashSet<String> strSet = new HashSet<String>(wordList);
        if(!strSet.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<String>();
        q.offer(beginWord);
        
        int count = 0;
        while(!q.isEmpty()){
            count++;
            int qSize = q.size();
            while(qSize > 0){
                qSize--;
                String cur = (String)q.poll();
                

                System.out.println("Count: " + count + " qSize: " + qSize + " String: " + cur);

                for(int i = 0; i < cur.length(); i++){
                    for(char c = 'a'; c <= 'z' ; c++){
                        StringBuilder sb = new StringBuilder(cur);
                        sb.setCharAt(i, c);

                        System.out.println("Cur: " + cur + " New: " + sb.toString());

                        if(sb.toString().equals(cur)) {
                            continue;
                        }

                        if(sb.toString().equals(endWord)){
                            return count+1;
                        } 

                        if(strSet.contains(sb.toString())){
                            q.offer(sb.toString());
                            strSet.remove(sb.toString());
                        }
                    }
                }
            }
        }
        return 0;
    }
}